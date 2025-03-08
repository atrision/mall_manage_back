package com.mall.manage.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.mall.common.annotation.Excel;
import com.mall.common.core.domain.BaseEntity;

/**
 * 轮播图对象 banners
 * 
 * @author misuzu
 * @date 2025-02-26
 */
public class Banners extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 轮播图ID */
    private Integer id;

    /** 图片URL */
    private String imageUrl;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 跳转链接 */
    @Excel(name = "跳转链接")
    private String linkUrl;

    /** 排序顺序 */
    private Long sortOrder;

    /** 状态：0-禁用，1-启用 */
    @Excel(name = "状态：0-禁用，1-启用")
    private Integer status;

    /** 创建时间 */
    private Date createdAt;

    /** 更新时间 */
    private Date updatedAt;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setLinkUrl(String linkUrl) 
    {
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() 
    {
        return linkUrl;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("imageUrl", getImageUrl())
            .append("title", getTitle())
            .append("linkUrl", getLinkUrl())
            .append("sortOrder", getSortOrder())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
