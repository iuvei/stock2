package com.stock.dao.model.stock;

import java.io.Serializable;
import java.util.Date;

public class StockOpenClosePrice implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.stock_open_close_price_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer stockOpenClosePriceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.stock_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer stockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.stock_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Double stockPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.price_type
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer priceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.price_date
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Double priceDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.creator
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.create_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.amender
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.amend_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_open_close_price.access_group
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_open_close_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.stock_open_close_price_id
     *
     * @return the value of stock_open_close_price.stock_open_close_price_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getStockOpenClosePriceId() {
        return stockOpenClosePriceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.stock_open_close_price_id
     *
     * @param stockOpenClosePriceId the value for stock_open_close_price.stock_open_close_price_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setStockOpenClosePriceId(Integer stockOpenClosePriceId) {
        this.stockOpenClosePriceId = stockOpenClosePriceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.stock_id
     *
     * @return the value of stock_open_close_price.stock_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.stock_id
     *
     * @param stockId the value for stock_open_close_price.stock_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.stock_price
     *
     * @return the value of stock_open_close_price.stock_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Double getStockPrice() {
        return stockPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.stock_price
     *
     * @param stockPrice the value for stock_open_close_price.stock_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.price_type
     *
     * @return the value of stock_open_close_price.price_type
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getPriceType() {
        return priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.price_type
     *
     * @param priceType the value for stock_open_close_price.price_type
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.price_date
     *
     * @return the value of stock_open_close_price.price_date
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Double getPriceDate() {
        return priceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.price_date
     *
     * @param priceDate the value for stock_open_close_price.price_date
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setPriceDate(Double priceDate) {
        this.priceDate = priceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.creator
     *
     * @return the value of stock_open_close_price.creator
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.creator
     *
     * @param creator the value for stock_open_close_price.creator
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.create_time
     *
     * @return the value of stock_open_close_price.create_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.create_time
     *
     * @param createTime the value for stock_open_close_price.create_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.amender
     *
     * @return the value of stock_open_close_price.amender
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.amender
     *
     * @param amender the value for stock_open_close_price.amender
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.amend_time
     *
     * @return the value of stock_open_close_price.amend_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.amend_time
     *
     * @param amendTime the value for stock_open_close_price.amend_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_open_close_price.access_group
     *
     * @return the value of stock_open_close_price.access_group
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_open_close_price.access_group
     *
     * @param accessGroup the value for stock_open_close_price.access_group
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_open_close_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StockOpenClosePrice other = (StockOpenClosePrice) that;
        return (this.getStockOpenClosePriceId() == null ? other.getStockOpenClosePriceId() == null : this.getStockOpenClosePriceId().equals(other.getStockOpenClosePriceId()))
            && (this.getStockId() == null ? other.getStockId() == null : this.getStockId().equals(other.getStockId()))
            && (this.getStockPrice() == null ? other.getStockPrice() == null : this.getStockPrice().equals(other.getStockPrice()))
            && (this.getPriceType() == null ? other.getPriceType() == null : this.getPriceType().equals(other.getPriceType()))
            && (this.getPriceDate() == null ? other.getPriceDate() == null : this.getPriceDate().equals(other.getPriceDate()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAmender() == null ? other.getAmender() == null : this.getAmender().equals(other.getAmender()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()))
            && (this.getAccessGroup() == null ? other.getAccessGroup() == null : this.getAccessGroup().equals(other.getAccessGroup()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_open_close_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStockOpenClosePriceId() == null) ? 0 : getStockOpenClosePriceId().hashCode());
        result = prime * result + ((getStockId() == null) ? 0 : getStockId().hashCode());
        result = prime * result + ((getStockPrice() == null) ? 0 : getStockPrice().hashCode());
        result = prime * result + ((getPriceType() == null) ? 0 : getPriceType().hashCode());
        result = prime * result + ((getPriceDate() == null) ? 0 : getPriceDate().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAmender() == null) ? 0 : getAmender().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        result = prime * result + ((getAccessGroup() == null) ? 0 : getAccessGroup().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_open_close_price
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stockOpenClosePriceId=").append(stockOpenClosePriceId);
        sb.append(", stockId=").append(stockId);
        sb.append(", stockPrice=").append(stockPrice);
        sb.append(", priceType=").append(priceType);
        sb.append(", priceDate=").append(priceDate);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", amender=").append(amender);
        sb.append(", amendTime=").append(amendTime);
        sb.append(", accessGroup=").append(accessGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}