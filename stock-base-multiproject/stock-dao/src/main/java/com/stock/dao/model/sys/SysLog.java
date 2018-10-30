package com.stock.dao.model.sys;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_id
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer logId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Date logTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_type
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_user_id
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer logUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_user_ip
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logUserIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_class
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_function
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logFunction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_parameters
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logParameters;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_return
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logReturn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_message
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_status
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String logStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.description
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.creator
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.access_group
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.amender
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.amend_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.record_version
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer recordVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.is_deleted
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_id
     *
     * @return the value of sys_log.log_id
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_id
     *
     * @param logId the value for sys_log.log_id
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_time
     *
     * @return the value of sys_log.log_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_time
     *
     * @param logTime the value for sys_log.log_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_type
     *
     * @return the value of sys_log.log_type
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogType() {
        return logType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_type
     *
     * @param logType the value for sys_log.log_type
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_user_id
     *
     * @return the value of sys_log.log_user_id
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getLogUserId() {
        return logUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_user_id
     *
     * @param logUserId the value for sys_log.log_user_id
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogUserId(Integer logUserId) {
        this.logUserId = logUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_user_ip
     *
     * @return the value of sys_log.log_user_ip
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogUserIp() {
        return logUserIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_user_ip
     *
     * @param logUserIp the value for sys_log.log_user_ip
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogUserIp(String logUserIp) {
        this.logUserIp = logUserIp == null ? null : logUserIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_class
     *
     * @return the value of sys_log.log_class
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogClass() {
        return logClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_class
     *
     * @param logClass the value for sys_log.log_class
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogClass(String logClass) {
        this.logClass = logClass == null ? null : logClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_function
     *
     * @return the value of sys_log.log_function
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogFunction() {
        return logFunction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_function
     *
     * @param logFunction the value for sys_log.log_function
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogFunction(String logFunction) {
        this.logFunction = logFunction == null ? null : logFunction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_parameters
     *
     * @return the value of sys_log.log_parameters
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogParameters() {
        return logParameters;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_parameters
     *
     * @param logParameters the value for sys_log.log_parameters
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogParameters(String logParameters) {
        this.logParameters = logParameters == null ? null : logParameters.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_return
     *
     * @return the value of sys_log.log_return
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogReturn() {
        return logReturn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_return
     *
     * @param logReturn the value for sys_log.log_return
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogReturn(String logReturn) {
        this.logReturn = logReturn == null ? null : logReturn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_message
     *
     * @return the value of sys_log.log_message
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogMessage() {
        return logMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_message
     *
     * @param logMessage the value for sys_log.log_message
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage == null ? null : logMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_status
     *
     * @return the value of sys_log.log_status
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getLogStatus() {
        return logStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_status
     *
     * @param logStatus the value for sys_log.log_status
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setLogStatus(String logStatus) {
        this.logStatus = logStatus == null ? null : logStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.description
     *
     * @return the value of sys_log.description
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.description
     *
     * @param description the value for sys_log.description
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.creator
     *
     * @return the value of sys_log.creator
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.creator
     *
     * @param creator the value for sys_log.creator
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_time
     *
     * @return the value of sys_log.create_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_time
     *
     * @param createTime the value for sys_log.create_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.access_group
     *
     * @return the value of sys_log.access_group
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.access_group
     *
     * @param accessGroup the value for sys_log.access_group
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.amender
     *
     * @return the value of sys_log.amender
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.amender
     *
     * @param amender the value for sys_log.amender
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.amend_time
     *
     * @return the value of sys_log.amend_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.amend_time
     *
     * @param amendTime the value for sys_log.amend_time
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.record_version
     *
     * @return the value of sys_log.record_version
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getRecordVersion() {
        return recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.record_version
     *
     * @param recordVersion the value for sys_log.record_version
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.is_deleted
     *
     * @return the value of sys_log.is_deleted
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.is_deleted
     *
     * @param isDeleted the value for sys_log.is_deleted
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
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
        SysLog other = (SysLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogTime() == null ? other.getLogTime() == null : this.getLogTime().equals(other.getLogTime()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogUserId() == null ? other.getLogUserId() == null : this.getLogUserId().equals(other.getLogUserId()))
            && (this.getLogUserIp() == null ? other.getLogUserIp() == null : this.getLogUserIp().equals(other.getLogUserIp()))
            && (this.getLogClass() == null ? other.getLogClass() == null : this.getLogClass().equals(other.getLogClass()))
            && (this.getLogFunction() == null ? other.getLogFunction() == null : this.getLogFunction().equals(other.getLogFunction()))
            && (this.getLogParameters() == null ? other.getLogParameters() == null : this.getLogParameters().equals(other.getLogParameters()))
            && (this.getLogReturn() == null ? other.getLogReturn() == null : this.getLogReturn().equals(other.getLogReturn()))
            && (this.getLogMessage() == null ? other.getLogMessage() == null : this.getLogMessage().equals(other.getLogMessage()))
            && (this.getLogStatus() == null ? other.getLogStatus() == null : this.getLogStatus().equals(other.getLogStatus()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAccessGroup() == null ? other.getAccessGroup() == null : this.getAccessGroup().equals(other.getAccessGroup()))
            && (this.getAmender() == null ? other.getAmender() == null : this.getAmender().equals(other.getAmender()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()))
            && (this.getRecordVersion() == null ? other.getRecordVersion() == null : this.getRecordVersion().equals(other.getRecordVersion()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogTime() == null) ? 0 : getLogTime().hashCode());
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getLogUserId() == null) ? 0 : getLogUserId().hashCode());
        result = prime * result + ((getLogUserIp() == null) ? 0 : getLogUserIp().hashCode());
        result = prime * result + ((getLogClass() == null) ? 0 : getLogClass().hashCode());
        result = prime * result + ((getLogFunction() == null) ? 0 : getLogFunction().hashCode());
        result = prime * result + ((getLogParameters() == null) ? 0 : getLogParameters().hashCode());
        result = prime * result + ((getLogReturn() == null) ? 0 : getLogReturn().hashCode());
        result = prime * result + ((getLogMessage() == null) ? 0 : getLogMessage().hashCode());
        result = prime * result + ((getLogStatus() == null) ? 0 : getLogStatus().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAccessGroup() == null) ? 0 : getAccessGroup().hashCode());
        result = prime * result + ((getAmender() == null) ? 0 : getAmender().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        result = prime * result + ((getRecordVersion() == null) ? 0 : getRecordVersion().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 02 17:03:16 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logTime=").append(logTime);
        sb.append(", logType=").append(logType);
        sb.append(", logUserId=").append(logUserId);
        sb.append(", logUserIp=").append(logUserIp);
        sb.append(", logClass=").append(logClass);
        sb.append(", logFunction=").append(logFunction);
        sb.append(", logParameters=").append(logParameters);
        sb.append(", logReturn=").append(logReturn);
        sb.append(", logMessage=").append(logMessage);
        sb.append(", logStatus=").append(logStatus);
        sb.append(", description=").append(description);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", accessGroup=").append(accessGroup);
        sb.append(", amender=").append(amender);
        sb.append(", amendTime=").append(amendTime);
        sb.append(", recordVersion=").append(recordVersion);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}