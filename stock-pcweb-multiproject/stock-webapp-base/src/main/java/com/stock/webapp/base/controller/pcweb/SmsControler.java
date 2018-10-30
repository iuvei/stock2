/**
 * 系统名称	: 海盟供应链系统
 * 模块名称	: com.stock.controller.pcweb
 * 类/接口名	: SmsControler
 * 版本信息	: 1.00
 * 新建日期	: 2017年5月7日下午2:44:34
 * 作者		: chengxl
 * 修改历史	: 2017年5月7日下午2:44:34
 * Copyright (c) zjport Co., Ltd,2017.All rights reserved.
 */
package com.stock.webapp.base.controller.pcweb;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stock.service.common.SmsService;
/**
 * 
 * ClassName	: SmsControler
 * Function		: TODO
 * date 		: 2017年5月7日下午3:22:23
 * @author chengxl
 * @version		: 
 * @since   JDK 1.7
 */
@Controller
@RequestMapping("/sms")
public class SmsControler {
	@Autowired
	private SmsService smsService;
	
	/**
	 * 
	 * smsSend:(这里用一句话描述这个方法的作用). <br/> 
	 * TODO(这里描述这个方法适用条件 – 可选).<br/> 
	 * 
	 * @author chengxl 
	 * @param request
	 * @return 
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/smsSend.do")
	public  @ResponseBody Object  smsSend(HttpServletRequest request){
		
		String mobiles = request.getParameter("mobiles");
		
		String content = request.getParameter("content");
		
		
		return smsService.sendSMS(mobiles, content);
	}

	
}
