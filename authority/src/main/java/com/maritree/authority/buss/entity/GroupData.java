package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 分组数据资源表
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@TableName("sys_group_data")
public class GroupData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 分组id/用户id
     */
    @TableField("group_id")
    private String groupId;
    /**
     * 资源id
     */
    @TableField("data_id")
    private String dataId;
    /**
     * 备注
     */
    private String comments;
    /**
     * 操作时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 操作人id
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
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
        return "GroupData{" +
                ", id=" + id +
                ", groupId=" + groupId +
                ", dataId=" + dataId +
                ", comments=" + comments +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", updateTime=" + updateTime +
                ", updateUser=" + updateUser +
                "}";
    }
}
