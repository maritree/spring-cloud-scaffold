package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统分组表
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@TableName("sys_group")
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一group_id
     */
    private String id;
    /**
     * 组编码
     */
    @TableField("group_code")
    private String groupCode;
    /**
     * 组名称
     */
    @TableField("group_name")
    private String groupName;
    /**
     * 父id
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 所属地区的ID
     */
    @TableField("area_id")
    private String areaId;
    /**
     * 树状关系
     */
    @TableField("group_path")
    private String groupPath;
    /**
     * 组类型，role角色，depart部门，custom自定义，其他
     */
    @TableField("group_type")
    private String groupType;
    /**
     * 排序id
     */
    @TableField("sort_id")
    private Integer sortId;
    /**
     * 部门简称
     */
    @TableField("group_short_name")
    private String groupShortName;
    /**
     * 部门电话
     */
    @TableField("group_phone")
    private String groupPhone;
    /**
     * 部门传真
     */
    @TableField("group_fax")
    private String groupFax;
    /**
     * 部门地址
     */
    @TableField("group_address")
    private String groupAddress;
    /**
     * 部门层级 1最高院，2高院，3中院，4基层法院，5部门
     */
    @TableField("group_level")
    private String groupLevel;
    @TableField("project_code")
    private String projectCode;
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

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getGroupPath() {
        return groupPath;
    }

    public void setGroupPath(String groupPath) {
        this.groupPath = groupPath;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getGroupShortName() {
        return groupShortName;
    }

    public void setGroupShortName(String groupShortName) {
        this.groupShortName = groupShortName;
    }

    public String getGroupPhone() {
        return groupPhone;
    }

    public void setGroupPhone(String groupPhone) {
        this.groupPhone = groupPhone;
    }

    public String getGroupFax() {
        return groupFax;
    }

    public void setGroupFax(String groupFax) {
        this.groupFax = groupFax;
    }

    public String getGroupAddress() {
        return groupAddress;
    }

    public void setGroupAddress(String groupAddress) {
        this.groupAddress = groupAddress;
    }

    public String getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(String groupLevel) {
        this.groupLevel = groupLevel;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
        return "Group{" +
                ", id=" + id +
                ", groupCode=" + groupCode +
                ", groupName=" + groupName +
                ", parentId=" + parentId +
                ", areaId=" + areaId +
                ", groupPath=" + groupPath +
                ", groupType=" + groupType +
                ", sortId=" + sortId +
                ", groupShortName=" + groupShortName +
                ", groupPhone=" + groupPhone +
                ", groupFax=" + groupFax +
                ", groupAddress=" + groupAddress +
                ", groupLevel=" + groupLevel +
                ", projectCode=" + projectCode +
                ", undeletableFlag=" + undeletableFlag +
                ", comments=" + comments +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", updateTime=" + updateTime +
                ", updateUser=" + updateUser +
                "}";
    }
}
