package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author maritree
 * @since 2018-08-11
 */
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @TableField("role_name")
    private String roleName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
        ", id=" + id +
        ", roleName=" + roleName +
        "}";
    }
}
