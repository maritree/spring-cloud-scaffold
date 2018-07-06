package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@TableName("sys_data")
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一group_id
     */
    private String id;
    /**
     * 组编码
     */
    @TableField("data_code")
    private String dataCode;
    /**
     * 组名称
     */
    @TableField("data_name")
    private String dataName;
    /**
     * 父id
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 树状关系
     */
    @TableField("data_path")
    private String dataPath;
    /**
     * 组类型，role角色，depart部门，data数据权限，其他
     */
    @TableField("data_type")
    private String dataType;
    /**
     * 排序id
     */
    @TableField("sort_id")
    private Integer sortId;
    /**
     * 请求url，可能是显示在页面的一个资源
     */
    private String url;
    /**
     * 部门简称
     */
    @TableField("data_short_name")
    private String dataShortName;
    /**
     * 部门电话
     */
    private String phone;
    /**
     * 部门传真
     */
    private String fax;
    /**
     * 部门地址
     */
    private String address;
    /**
     * 部门层级 1最高院，2高院，3中院，4基层法院，5部门
     */
    private String level;
    /**
     * 0可以删除，1不可以删除
     */
    @TableField("undeletable_flag")
    private String undeletableFlag;
    /**
     * 备注
     */
    private String comments;
    /**
     * 创建日期
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 创建人
     */
    @TableField("create_user")
    private String createUser;
    /**
     * 最后修改日期
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 最后修改人
     */
    @TableField("update_user")
    private String updateUser;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDataShortName() {
        return dataShortName;
    }

    public void setDataShortName(String dataShortName) {
        this.dataShortName = dataShortName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUndeletableFlag() {
        return undeletableFlag;
    }

    public void setUndeletableFlag(String undeletableFlag) {
        this.undeletableFlag = undeletableFlag;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
        return "Data{" +
                ", id=" + id +
                ", dataCode=" + dataCode +
                ", dataName=" + dataName +
                ", parentId=" + parentId +
                ", dataPath=" + dataPath +
                ", dataType=" + dataType +
                ", sortId=" + sortId +
                ", url=" + url +
                ", dataShortName=" + dataShortName +
                ", phone=" + phone +
                ", fax=" + fax +
                ", address=" + address +
                ", level=" + level +
                ", undeletableFlag=" + undeletableFlag +
                ", comments=" + comments +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", updateTime=" + updateTime +
                ", updateUser=" + updateUser +
                "}";
    }
}
