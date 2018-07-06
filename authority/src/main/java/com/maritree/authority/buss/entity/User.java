package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统用户表,loginname和departid唯一
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户user_id
     */
    private String id;
    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;
    /**
     * 登陆名称
     */
    @TableField("login_name")
    private String loginName;
    /**
     * 部门id
     */
    @TableField("depart_id")
    private String departId;
    /**
     * 排序id
     */
    @TableField("sort_id")
    private Integer sortId;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码修改次数
     */
    @TableField("password_chg_times")
    private Integer passwordChgTimes;
    /**
     * 用户等级
     */
    @TableField("user_level")
    private String userLevel;
    /**
     * 工号
     */
    @TableField("employee_num")
    private String employeeNum;
    /**
     * 用户手机
     */
    @TableField("user_mobile")
    private String userMobile;
    /**
     * 邮箱
     */
    @TableField("user_email")
    private String userEmail;
    /**
     * 用户状态 0 正常 1 删除
     */
    @TableField("user_status")
    private String userStatus;
    /**
     * 备注
     */
    private String comments;
    /**
     * 用户出生日期
     */
    @TableField("user_birthdate")
    private String userBirthdate;
    /**
     * 性别
     */
    @TableField("user_sex")
    private String userSex;
    /**
     * 身份证号码
     */
    @TableField("user_idcard")
    private String userIdcard;
    /**
     * 用户头像路径
     */
    @TableField("user_photo")
    private String userPhoto;
    /**
     * 入职日期
     */
    @TableField("work_date")
    private String workDate;
    /**
     * 职务
     */
    @TableField("work_duty")
    private String workDuty;
    /**
     * 办公电话
     */
    @TableField("work_telephone")
    private String workTelephone;
    /**
     * 政治面貌
     */
    @TableField("party_id")
    private String partyId;
    /**
     * 0可以删除，1不可以删除
     */
    @TableField("undeletable_flag")
    private String undeletableFlag;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 创建人
     */
    @TableField("create_user")
    private String createUser;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 更新人
     */
    @TableField("update_user")
    private String updateUser;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPasswordChgTimes() {
        return passwordChgTimes;
    }

    public void setPasswordChgTimes(Integer passwordChgTimes) {
        this.passwordChgTimes = passwordChgTimes;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUserBirthdate() {
        return userBirthdate;
    }

    public void setUserBirthdate(String userBirthdate) {
        this.userBirthdate = userBirthdate;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkDuty() {
        return workDuty;
    }

    public void setWorkDuty(String workDuty) {
        this.workDuty = workDuty;
    }

    public String getWorkTelephone() {
        return workTelephone;
    }

    public void setWorkTelephone(String workTelephone) {
        this.workTelephone = workTelephone;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getUndeletableFlag() {
        return undeletableFlag;
    }

    public void setUndeletableFlag(String undeletableFlag) {
        this.undeletableFlag = undeletableFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "User{" +
                ", id=" + id +
                ", userName=" + userName +
                ", loginName=" + loginName +
                ", departId=" + departId +
                ", sortId=" + sortId +
                ", password=" + password +
                ", passwordChgTimes=" + passwordChgTimes +
                ", userLevel=" + userLevel +
                ", employeeNum=" + employeeNum +
                ", userMobile=" + userMobile +
                ", userEmail=" + userEmail +
                ", userStatus=" + userStatus +
                ", comments=" + comments +
                ", userBirthdate=" + userBirthdate +
                ", userSex=" + userSex +
                ", userIdcard=" + userIdcard +
                ", userPhoto=" + userPhoto +
                ", workDate=" + workDate +
                ", workDuty=" + workDuty +
                ", workTelephone=" + workTelephone +
                ", partyId=" + partyId +
                ", undeletableFlag=" + undeletableFlag +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", updateTime=" + updateTime +
                ", updateUser=" + updateUser +
                "}";
    }
}
