package com.mall.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.manage.mapper.OrdersMapper;
import com.mall.manage.domain.Orders;
import com.mall.manage.service.IOrdersService;

/**
 * 订单管理Service业务层处理
 * 
 * @author misuzu
 * @date 2025-02-26
 */
@Service
public class OrdersServiceImpl implements IOrdersService 
{
    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    @Override
    public Orders selectOrdersById(Integer id)
    {
        return ordersMapper.selectOrdersById(id);
    }

    /**
     * 查询订单管理列表
     * 
     * @param orders 订单管理
     * @return 订单管理
     */
    @Override
    public List<Orders> selectOrdersList(Orders orders)
    {
        return ordersMapper.selectOrdersList(orders);
    }

    /**
     * 新增订单管理
     * 
     * @param orders 订单管理
     * @return 结果
     */
    @Override
    public int insertOrders(Orders orders)
    {
        return ordersMapper.insertOrders(orders);
    }

    /**
     * 修改订单管理
     * 
     * @param orders 订单管理
     * @return 结果
     */
    @Override
    public int updateOrders(Orders orders)
    {
        return ordersMapper.updateOrders(orders);
    }

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByIds(Integer[] ids)
    {
        return ordersMapper.deleteOrdersByIds(ids);
    }

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    @Override
    public int deleteOrdersById(Integer id)
    {
        return ordersMapper.deleteOrdersById(id);
    }
}
