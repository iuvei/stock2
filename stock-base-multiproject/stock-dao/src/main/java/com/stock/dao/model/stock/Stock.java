package com.stock.dao.model.stock;

import java.io.Serializable;
import java.util.Date;

public class Stock implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.stock_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer stockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.business_type
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private String businessType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.stock_name
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private String stockName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.stock_code
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private String stockCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.description
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.creator
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.create_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.amender
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.amend_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.access_group
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.stock_id
     *
     * @return the value of stock.stock_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.stock_id
     *
     * @param stockId the value for stock.stock_id
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.business_type
     *
     * @return the value of stock.business_type
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.business_type
     *
     * @param businessType the value for stock.business_type
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.stock_name
     *
     * @return the value of stock.stock_name
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.stock_name
     *
     * @param stockName the value for stock.stock_name
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.stock_code
     *
     * @return the value of stock.stock_code
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.stock_code
     *
     * @param stockCode the value for stock.stock_code
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.description
     *
     * @return the value of stock.description
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.description
     *
     * @param description the value for stock.description
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.creator
     *
     * @return the value of stock.creator
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.creator
     *
     * @param creator the value for stock.creator
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.create_time
     *
     * @return the value of stock.create_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.create_time
     *
     * @param createTime the value for stock.create_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.amender
     *
     * @return the value of stock.amender
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.amender
     *
     * @param amender the value for stock.amender
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.amend_time
     *
     * @return the value of stock.amend_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.amend_time
     *
     * @param amendTime the value for stock.amend_time
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.access_group
     *
     * @return the value of stock.access_group
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.access_group
     *
     * @param accessGroup the value for stock.access_group
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
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
        Stock other = (Stock) that;
        return (this.getStockId() == null ? other.getStockId() == null : this.getStockId().equals(other.getStockId()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getStockName() == null ? other.getStockName() == null : this.getStockName().equals(other.getStockName()))
            && (this.getStockCode() == null ? other.getStockCode() == null : this.getStockCode().equals(other.getStockCode()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAmender() == null ? other.getAmender() == null : this.getAmender().equals(other.getAmender()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()))
            && (this.getAccessGroup() == null ? other.getAccessGroup() == null : this.getAccessGroup().equals(other.getAccessGroup()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStockId() == null) ? 0 : getStockId().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getStockName() == null) ? 0 : getStockName().hashCode());
        result = prime * result + ((getStockCode() == null) ? 0 : getStockCode().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAmender() == null) ? 0 : getAmender().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        result = prime * result + ((getAccessGroup() == null) ? 0 : getAccessGroup().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Thu Nov 01 14:24:56 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stockId=").append(stockId);
        sb.append(", businessType=").append(businessType);
        sb.append(", stockName=").append(stockName);
        sb.append(", stockCode=").append(stockCode);
        sb.append(", description=").append(description);
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