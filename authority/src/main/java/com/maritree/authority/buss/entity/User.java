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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @TableField("neck_name")
    private String neckName;
    @TableField("user_name")
    private String userName;
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeckName() {
        return neckName;
    }

    public void setNeckName(String neckName) {
        this.neckName = neckName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", neckName=" + neckName +
        ", userName=" + userName +
        ", password=" + password +
        "}";
    }
}
