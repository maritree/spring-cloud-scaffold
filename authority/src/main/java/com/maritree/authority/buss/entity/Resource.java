package com.maritree.authority.buss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统资源表
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@TableName("sys_resource")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源resource_id
     */
    private String id;
    /**
     * 编码
     */
    @TableField("resource_code")
    private String resourceCode;
    /**
     * 树状关系
     */
    @TableField("resource_path")
    private String resourcePath;
    /**
     * 路由路径
     */
    @TableField("route_path")
    private String routePath;
    /**
     * 路由是否展示
     */
    @TableField("route_hidden")
    private String routeHidden;
    /**
     * 资源名称
     */
    @TableField("resource_name")
    private String resourceName;
    /**
     * 父节点id
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 是否目录0不是目录1是目录
     */
    @TableField("menu_flag")
    private String menuFlag;
    /**
     * 资源类型 menu菜单/button按钮/link链接
     */
    @TableField("resource_type")
    private String resourceType;
    /**
     * 请求url
     */
    @TableField("request_url")
    private String requestUrl;
    /**
     * restful风格url的http提交方式
     */
    @TableField("request_type")
    private String requestType;
    /**
     * ppublic  - 公开访问,protect - 需登录,authorize - 需授权
     */
    @TableField("access_level")
    private String accessLevel;
    /**
     * 页面元素
     */
    @TableField("html_element")
    private String htmlElement;
    /**
     * 对应的资源字符串
     */
    @TableField("resource_value")
    private String resourceValue;
    /**
     * 鉴权方式 0无鉴权 1登录鉴权 2授权鉴权
     */
    @TableField("authentication_type")
    private String authenticationType;
    /**
     * 排序字段
     */
    @TableField("sort_id")
    private Integer sortId;
    /**
     * 是否展示，0否1是，默认为1
     */
    @TableField("show_flag")
    private String showFlag;
    /**
     * 图标类
     */
    @TableField("icon_class")
    private String iconClass;
    /**
     * 0可以删除，1不可以删除
     */
    @TableField("undeletable_flag")
    private String undeletableFlag;
    /**
     * 备注
     */
    private String comments;
    @TableField("project_code")
    private String projectCode;
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

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getRoutePath() {
        return routePath;
    }

    public void setRoutePath(String routePath) {
        this.routePath = routePath;
    }

    public String getRouteHidden() {
        return routeHidden;
    }

    public void setRouteHidden(String routeHidden) {
        this.routeHidden = routeHidden;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuFlag() {
        return menuFlag;
    }

    public void setMenuFlag(String menuFlag) {
        this.menuFlag = menuFlag;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(String htmlElement) {
        this.htmlElement = htmlElement;
    }

    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(String showFlag) {
        this.showFlag = showFlag;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
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

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
        return "Resource{" +
                ", id=" + id +
                ", resourceCode=" + resourceCode +
                ", resourcePath=" + resourcePath +
                ", routePath=" + routePath +
                ", routeHidden=" + routeHidden +
                ", resourceName=" + resourceName +
                ", parentId=" + parentId +
                ", menuFlag=" + menuFlag +
                ", resourceType=" + resourceType +
                ", requestUrl=" + requestUrl +
                ", requestType=" + requestType +
                ", accessLevel=" + accessLevel +
                ", htmlElement=" + htmlElement +
                ", resourceValue=" + resourceValue +
                ", authenticationType=" + authenticationType +
                ", sortId=" + sortId +
                ", showFlag=" + showFlag +
                ", iconClass=" + iconClass +
                ", undeletableFlag=" + undeletableFlag +
                ", comments=" + comments +
                ", projectCode=" + projectCode +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                ", updateTime=" + updateTime +
                ", updateUser=" + updateUser +
                "}";
    }
}
