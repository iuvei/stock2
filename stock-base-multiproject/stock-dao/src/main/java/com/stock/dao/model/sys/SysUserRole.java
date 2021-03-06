package com.stock.dao.model.sys;

import java.io.Serializable;
import java.util.Date;

public class SysUserRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_role_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer userRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.role_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.status
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.description
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.creator
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.create_time
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.access_group
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.amender
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.amend_time
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.record_version
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer recordVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.is_deleted
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_role
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_role_id
     *
     * @return the value of sys_user_role.user_role_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_role_id
     *
     * @param userRoleId the value for sys_user_role.user_role_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_id
     *
     * @return the value of sys_user_role.user_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_id
     *
     * @param userId the value for sys_user_role.user_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.role_id
     *
     * @return the value of sys_user_role.role_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.role_id
     *
     * @param roleId the value for sys_user_role.role_id
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.status
     *
     * @return the value of sys_user_role.status
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.status
     *
     * @param status the value for sys_user_role.status
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.description
     *
     * @return the value of sys_user_role.description
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.description
     *
     * @param description the value for sys_user_role.description
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.creator
     *
     * @return the value of sys_user_role.creator
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.creator
     *
     * @param creator the value for sys_user_role.creator
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.create_time
     *
     * @return the value of sys_user_role.create_time
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.create_time
     *
     * @param createTime the value for sys_user_role.create_time
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.access_group
     *
     * @return the value of sys_user_role.access_group
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.access_group
     *
     * @param accessGroup the value for sys_user_role.access_group
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.amender
     *
     * @return the value of sys_user_role.amender
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.amender
     *
     * @param amender the value for sys_user_role.amender
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.amend_time
     *
     * @return the value of sys_user_role.amend_time
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.amend_time
     *
     * @param amendTime the value for sys_user_role.amend_time
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.record_version
     *
     * @return the value of sys_user_role.record_version
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getRecordVersion() {
        return recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.record_version
     *
     * @param recordVersion the value for sys_user_role.record_version
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.is_deleted
     *
     * @return the value of sys_user_role.is_deleted
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.is_deleted
     *
     * @param isDeleted the value for sys_user_role.is_deleted
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
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
        SysUserRole other = (SysUserRole) that;
        return (this.getUserRoleId() == null ? other.getUserRoleId() == null : this.getUserRoleId().equals(other.getUserRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRoleId() == null) ? 0 : getUserRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Mon May 22 05:44:45 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleId=").append(userRoleId);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", status=").append(status);
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