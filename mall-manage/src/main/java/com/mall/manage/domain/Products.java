package com.mall.manage.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.mall.common.annotation.Excel;
import com.mall.common.core.domain.BaseEntity;

/**
 * 商品管理对象 products
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
public class Products extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    private Integer id;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Integer categoryId;

    /** 商品标题 */
    @Excel(name = "商品标题")
    private String title;

    /** 商品图片URL */
    private String imageUrl;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal price;

    /** 状态：0-下架，1-上架 */
    @Excel(name = "状态：0-下架，1-上架")
    private Integer status;

    /** 创建时间 */
    private Date createdAt;

    /** 更新时间 */
    private Date updatedAt;

    /** 销量 */
    @Excel(name = "销量")
    private Long rate;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCategoryId(Integer categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() 
    {
        return categoryId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
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
    public void setRate(Long rate) 
    {
        this.rate = rate;
    }

    public Long getRate() 
    {
        return rate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("categoryId", getCategoryId())
            .append("title", getTitle())
            .append("imageUrl", getImageUrl())
            .append("price", getPrice())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("rate", getRate())
            .toString();
    }
}
