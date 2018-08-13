package com.maritree.authority.buss.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author maritree
 * @since 2018-08-11
 */
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String url;
    private String method;
    private String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resource{" +
        ", id=" + id +
        ", name=" + name +
        ", url=" + url +
        ", method=" + method +
        ", type=" + type +
        "}";
    }
}
