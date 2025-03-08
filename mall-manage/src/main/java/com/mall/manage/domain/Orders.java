package com.mall.manage.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.mall.common.annotation.Excel;
import com.mall.common.core.domain.BaseEntity;

/**
 * 订单管理对象 orders
 * 
 * @author misuzu
 * @date 2025-02-26
 */
public class Orders extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Integer id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer userId;

    /** 订单状态：0-待支付，1-已支付，2-已发货，3-已完成，4-已取消 */
    @Excel(name = "订单状态：0-待支付，1-已支付，2-已发货，3-已完成，4-已取消")
    private Integer orderStatus;

    /** 订单总金额 */
    @Excel(name = "订单总金额")
    private BigDecimal totalAmount;

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
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setOrderStatus(Integer orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() 
    {
        return orderStatus;
    }
    public void setTotalAmount(BigDecimal totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() 
    {
        return totalAmount;
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
            .append("userId", getUserId())
            .append("orderStatus", getOrderStatus())
            .append("totalAmount", getTotalAmount())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
