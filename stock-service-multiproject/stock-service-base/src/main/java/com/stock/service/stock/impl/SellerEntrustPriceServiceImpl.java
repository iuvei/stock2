package com.stock.service.stock.impl;


import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.stock.dao.mapper.stock.BuyerEntrustPriceMapper;
import com.stock.dao.mapper.stock.SellerEntrustPriceQueueMapper;
import com.stock.dao.model.stock.*;
import com.stock.dao.model.sys.SysUser;
import com.stock.service.stock.*;
import com.stock.service.sys.SysUserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.common.exceptions.BizException;
import com.stock.common.tool.log.ErrorLoggers;
import com.stock.common.tool.log.LogUtil;
import com.stock.dao.page.Page;
import com.stock.service.common.util.DateJsonValueProcessor;
import com.stock.service.sys.utils.HttpResponseConstants.Public;
import com.stock.pojo.vo.RequestResultVO;
import com.stock.service.common.DataAuthorizeService;
import com.stock.service.sys.utils.ResultBuilder;
import com.stock.service.sys.CommonService;
import com.stock.dao.mapper.stock.SellerEntrustPriceMapper;

import com.stock.pojo.vo.stock.SellerEntrustPriceVO;

@Service
public class SellerEntrustPriceServiceImpl implements SellerEntrustPriceService {

    @Autowired
    private SellerEntrustPriceMapper sellerEntrustPriceMapper;

    @Autowired
    private DataAuthorizeService dataAuthorizeService;

    @Autowired
    private BuyerEntrustPriceMapper buyerEntrustPriceMapper;

    @Autowired
    private StockAccountService stockAccountService;

    @Autowired
    private BuyerEntrustPriceService buyerEntrustPriceService;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private StockExistingService stockExistingService;

    @Autowired
    private BuyerEntrustPriceQueueService buyerEntrustPriceQueueService;

    @Autowired
    private SellerEntrustPriceQueueService sellerEntrustPriceQueueService;

    @Autowired
    private SellerEntrustPriceQueueMapper sellerEntrustPriceQueueMapper;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    SellerHistoryEntrustRecordService sellerHistoryEntrustRecordService;

    @Autowired
    BuyerHistoryEntrustRecordService buyerHistoryEntrustRecordService;

    private CommonService<SellerEntrustPrice, SellerEntrustPriceMapper, SellerEntrustPriceExample> commonService;

    //注入commonService
    @Resource(name = "commonService")
    public void setCommonService(CommonService<SellerEntrustPrice, SellerEntrustPriceMapper, SellerEntrustPriceExample> commonService) {
        this.commonService = commonService;
    }

    @Override
    public RequestResultVO insert(SellerEntrustPrice sellerEntrustPrice) {
        if (sellerEntrustPrice == null) {
            throw new BizException(Public.ERROR_700);
        }
        dataAuthorizeService.addDataAuthorizeInfo(sellerEntrustPrice, "insert");
        sellerEntrustPriceMapper.insert(sellerEntrustPrice);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_200, "");
    }

    @Override
    public RequestResultVO update(SellerEntrustPrice sellerEntrustPrice) {
        if (sellerEntrustPrice == null || sellerEntrustPrice.getSellerEntrustPriceId() == null) {
            throw new BizException(Public.ERROR_700);
        }
        dataAuthorizeService.addDataAuthorizeInfo(sellerEntrustPrice, "update");
        sellerEntrustPriceMapper.updateByPrimaryKeySelective(sellerEntrustPrice);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_300, "");
    }

    @Override
    public RequestResultVO delete(List<Integer> sellerEntrustPriceIds) {
        if (sellerEntrustPriceIds == null || sellerEntrustPriceIds.size() == 0) {
            throw new BizException(Public.ERROR_700);
        }
        SellerEntrustPriceExample sellerEntrustPriceExample = new SellerEntrustPriceExample();
        sellerEntrustPriceExample.createCriteria().andSellerEntrustPriceIdIn(sellerEntrustPriceIds);
        sellerEntrustPriceMapper.deleteByExample(sellerEntrustPriceExample);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_400, "");
    }

    @Override
    public Map<String, Object> getByPage(String keys, Integer pageSize,
                                         Integer pageNow) {
        SellerEntrustPriceExample sellerEntrustPriceExample = new SellerEntrustPriceExample();
        this.setCriteria(keys, sellerEntrustPriceExample);
        int totalrecords = sellerEntrustPriceMapper.countByExample(sellerEntrustPriceExample);

        Page page = new Page();
        page.setBegin(pageNow);
        page.setLength(pageSize);
        sellerEntrustPriceExample.setOrderByClause("sellerEntrustPriceId desc");
        sellerEntrustPriceExample.setPage(page);
        List<SellerEntrustPrice> sellerEntrustPrices = sellerEntrustPriceMapper.selectByExample(sellerEntrustPriceExample);

        Map<String, Object> map = new HashMap<String, Object>();
        JsonConfig config = new JsonConfig();
        config.setIgnoreDefaultExcludes(false);
        config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
        try {
            map.put("aaData", JSONArray.fromObject(this.creatVos(sellerEntrustPrices), config));
        } catch (Exception e) {
            LogUtil.error(ErrorLoggers.ERROR_LOGGER, e.getMessage());
            throw new BizException(Public.ERROR_100);
        }
        map.put("recordsTotal", totalrecords);
        map.put("recordsFiltered", totalrecords);

        return map;
    }

    @Override
    public RequestResultVO sell(String price, String priceQueue) {
        BuyerEntrustPrice buyerEntrustPrice = buyerEntrustPriceService.findBuyerEntrustPriceByPriceAndStock(price);

        SellerEntrustPrice sellerEntrustPrice = findSellerEntrustPriceByPriceAndStock(price);

        JSONObject priceQueueKeys = JSONObject.fromObject(priceQueue);
        JSONObject priceKeys = JSONObject.fromObject(price);

        StockAccount buyerStockAccount;//资金账户
        StockAccount sellerStockAccount= stockAccountService.findStockAccountByUser();;

        StockExisting buyerStockExisting;//股票账户
        StockExisting sellerStockExisting=stockExistingService.findStockExistingByAccountAndStock(sellerStockAccount.getStockAccountId(), Integer.parseInt(priceKeys.getString("stockId")));;

        int entrustNum = Integer.parseInt(priceQueueKeys.getString("entrustNum"));

        SellerEntrustPriceQueue sellerEntrustPriceQueue = new SellerEntrustPriceQueue();
        sellerEntrustPriceQueue.setEntrustNum(entrustNum);
        SysUser user = (SysUser) httpSession.getAttribute("loginingUser");
        sellerEntrustPriceQueue.setUserId(user.getUserId());
        dataAuthorizeService.addDataAuthorizeInfo(sellerEntrustPriceQueue, "insert");


        if (buyerEntrustPrice != null) {//如果买家当中有匹配的，那么改变卖家买家的资金账户和股票账户
            List<BuyerEntrustPriceQueue> buyerEntrustPriceQueues = buyerEntrustPriceQueueService.findByBuyerEntrustPrice(buyerEntrustPrice.getBuyerEntrustPriceId());
            BuyerEntrustPriceQueue buyerEntrustPriceQueue=buyerEntrustPriceQueues.get(0);
            int stockId = buyerEntrustPrice.getStockId();
            buyerStockAccount = stockAccountService.findStockAccountByUser(String.valueOf(buyerEntrustPriceQueue.getUserId()));


            buyerStockExisting = stockExistingService.findStockExistingByAccountAndStock(buyerStockAccount.getStockAccountId(), stockId);

            //改变持仓
            buyerStockExisting.setStockAvailableSellNum(buyerStockExisting.getStockAvailableSellNum() + entrustNum);
            sellerStockExisting.setStockAvailableSellNum(sellerStockExisting.getStockAvailableSellNum() - entrustNum);

            stockExistingService.update(buyerStockExisting);
            stockExistingService.update(sellerStockExisting);

            buyerEntrustPriceQueueService.delete(Arrays.asList(buyerEntrustPriceQueue.getBuyerEntrustPriceQueueId()));
            //sellerEntrustPriceQueueService.delete(Arrays.asList(SellerEntrustPriceQueue.))

            //改变资金账户
            double total = entrustNum * Double.valueOf(priceKeys.getString("entrustPrice"));
            buyerStockAccount.setAvailableFund(buyerStockAccount.getAvailableFund() - total);
            buyerStockAccount.setTotalAsset(buyerStockAccount.getTotalAsset()+total);
            buyerStockAccount.setStockAsset(buyerStockAccount.getStockAsset()+total);
            stockAccountService.update(buyerStockAccount);

            sellerStockAccount.setAvailableFund(sellerStockAccount.getAvailableFund() + total);
            sellerStockAccount.setTotalAsset(sellerStockAccount.getTotalAsset()+total);
            sellerStockAccount.setTotalAsset(sellerStockAccount.getTotalAsset()+total);
            sellerStockAccount.setStockAsset(sellerStockAccount.getStockAsset()+total);
            stockAccountService.update(sellerStockAccount);

            sellerHistoryEntrustRecordService.addHistory(sellerEntrustPriceQueue,stockId,Double.valueOf(priceKeys.getString("entrustPrice")));
            buyerHistoryEntrustRecordService.addHistory(buyerEntrustPriceQueue,stockId,Double.valueOf(priceKeys.getString("entrustPrice")));

            if(buyerEntrustPriceQueues.size()==0){
                buyerEntrustPriceService.delete(Arrays.asList(buyerEntrustPrice.getBuyerEntrustPriceId()));
            }
        } else {//去卖家价格队列中找

            if (sellerEntrustPrice != null) {
                //SellerEntrustPriceQueue sellerEntrustPriceQueue=sellerEntrustPriceQueueService.findBySllerEntrustPrice(sellerEntrustPrice.getSellerEntrustPriceId());
                sellerEntrustPrice.setTotalEntrustNum(sellerEntrustPrice.getTotalEntrustNum() + entrustNum);
                sellerEntrustPriceMapper.updateByPrimaryKey(sellerEntrustPrice);
            } else {
                sellerEntrustPrice = new SellerEntrustPrice();
                sellerEntrustPrice.setEntrustPrice(Double.valueOf(priceKeys.getString("entrustPrice")));
                sellerEntrustPrice.setStockId(Integer.valueOf(priceKeys.getString("stockId")));
                sellerEntrustPrice.setTotalEntrustNum(entrustNum);
                this.insert(sellerEntrustPrice);
            }
            sellerEntrustPriceQueue.setSellerEntrustPriceId(sellerEntrustPrice.getSellerEntrustPriceId());
            sellerEntrustPriceQueueMapper.insert(sellerEntrustPriceQueue);
        }
        sellerStockExisting.setStockAvailableSellNum(sellerStockExisting.getStockAvailableSellNum() - entrustNum);
        stockExistingService.update(sellerStockExisting);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_200, "");
    }

    @Override
    public SellerEntrustPrice findSellerEntrustPriceByPriceAndStock(String priceJson) {
        SellerEntrustPriceExample sellerEntrustPriceExample = new SellerEntrustPriceExample();
        SellerEntrustPriceExample.Criteria criteria = sellerEntrustPriceExample.createCriteria();
        JSONObject jKeys = JSONObject.fromObject(priceJson);
        criteria.andEntrustPriceEqualTo(Double.parseDouble(jKeys.getString("entrustPrice")));
        criteria.andStockIdEqualTo(Integer.parseInt(jKeys.getString("stockId")));
        List<SellerEntrustPrice> sellerEntrustPrices = sellerEntrustPriceMapper.selectByExample(sellerEntrustPriceExample);
        if (sellerEntrustPrices.size() != 0)
            return sellerEntrustPrices.get(0);
        else
            return null;
    }

    @Override
    public Integer findPriceVaild(Integer stock_id, Double stock_price) {
        SellerEntrustPriceExample sellerEntrustPriceExample = new SellerEntrustPriceExample();
        SellerEntrustPriceExample.Criteria criteria = sellerEntrustPriceExample.createCriteria();
        criteria.andEntrustPriceEqualTo(stock_price);
        criteria.andStockIdEqualTo(stock_id);
        List<SellerEntrustPrice> sellerEntrustPrices = sellerEntrustPriceMapper.selectByExample(sellerEntrustPriceExample);
        if (sellerEntrustPrices.size() != 0)
            return sellerEntrustPrices.get(0).getSellerEntrustPriceId();
        else
            return -1;
    }

    @Override
    public void mydelete(int sell_id) {
        sellerEntrustPriceMapper.deleteByPrimaryKey(sell_id);
    }

    private void setCriteria(String keys, SellerEntrustPriceExample sellerEntrustPriceExample) {
        if (keys == null || "{}".equals(keys))
            return;
        //JSONObject jKeys = JSONObject.fromObject(keys);
        //Criteria criteria = sellerEntrustPriceExample.createCriteria();

    }

    private List<SellerEntrustPriceVO> creatVos(List<SellerEntrustPrice> sellerEntrustPrices) throws Exception {
        List<SellerEntrustPriceVO> sellerEntrustPriceVOs = new ArrayList<SellerEntrustPriceVO>();
        for (SellerEntrustPrice sellerEntrustPrice : sellerEntrustPrices) {
            SellerEntrustPriceVO sellerEntrustPriceVO = new SellerEntrustPriceVO();
            BeanUtils.copyProperties(sellerEntrustPrice, sellerEntrustPriceVO);
            commonService.addBaseModel(sellerEntrustPrice, sellerEntrustPriceVO);
            sellerEntrustPriceVOs.add(sellerEntrustPriceVO);
        }
        return sellerEntrustPriceVOs;
    }


}




