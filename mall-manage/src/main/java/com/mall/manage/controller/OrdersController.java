package com.mall.manage.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mall.common.annotation.Log;
import com.mall.common.core.controller.BaseController;
import com.mall.common.core.domain.AjaxResult;
import com.mall.common.enums.BusinessType;
import com.mall.manage.domain.Orders;
import com.mall.manage.service.IOrdersService;
import com.mall.common.utils.poi.ExcelUtil;
import com.mall.common.core.page.TableDataInfo;

/**
 * 订单管理Controller
 * 
 * @author misuzu
 * @date 2025-02-26
 */
@RestController
@RequestMapping("/manage/orders")
public class OrdersController extends BaseController
{
    @Autowired
    private IOrdersService ordersService;

    /**
     * 查询订单管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:orders:list')")
    @GetMapping("/list")
    public TableDataInfo list(Orders orders)
    {
        startPage();
        List<Orders> list = ordersService.selectOrdersList(orders);
        return getDataTable(list);
    }

    /**
     * 导出订单管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:orders:export')")
    @Log(title = "订单管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Orders orders)
    {
        List<Orders> list = ordersService.selectOrdersList(orders);
        ExcelUtil<Orders> util = new ExcelUtil<Orders>(Orders.class);
        util.exportExcel(response, list, "订单管理数据");
    }

    /**
     * 获取订单管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:orders:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(ordersService.selectOrdersById(id));
    }

    /**
     * 新增订单管理
     */
    @PreAuthorize("@ss.hasPermi('manage:orders:add')")
    @Log(title = "订单管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Orders orders)
    {
        return toAjax(ordersService.insertOrders(orders));
    }

    /**
     * 修改订单管理
     */
    @PreAuthorize("@ss.hasPermi('manage:orders:edit')")
    @Log(title = "订单管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Orders orders)
    {
        return toAjax(ordersService.updateOrders(orders));
    }

    /**
     * 删除订单管理
     */
    @PreAuthorize("@ss.hasPermi('manage:orders:remove')")
    @Log(title = "订单管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(ordersService.deleteOrdersByIds(ids));
    }
}
