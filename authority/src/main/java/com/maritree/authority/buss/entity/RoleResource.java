package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author maritree
 * @since 2018-08-11
 */
@TableName("role_resource")
public class RoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @TableField("role_id")
    private String roleId;
    @TableField("resource_id")
    private String resourceId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "RoleResource{" +
        ", id=" + id +
        ", roleId=" + roleId +
        ", resourceId=" + resourceId +
        "}";
    }
}
