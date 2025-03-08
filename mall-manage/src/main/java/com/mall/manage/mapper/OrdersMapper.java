package com.mall.manage.mapper;

import java.util.List;
import com.mall.manage.domain.Orders;

/**
 * 订单管理Mapper接口
 * 
 * @author misuzu
 * @date 2025-02-26
 */
public interface OrdersMapper 
{
    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    public Orders selectOrdersById(Integer id);

    /**
     * 查询订单管理列表
     * 
     * @param orders 订单管理
     * @return 订单管理集合
     */
    public List<Orders> selectOrdersList(Orders orders);

    /**
     * 新增订单管理
     * 
     * @param orders 订单管理
     * @return 结果
     */
    public int insertOrders(Orders orders);

    /**
     * 修改订单管理
     * 
     * @param orders 订单管理
     * @return 结果
     */
    public int updateOrders(Orders orders);

    /**
     * 删除订单管理
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    public int deleteOrdersById(Integer id);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrdersByIds(Integer[] ids);
}
