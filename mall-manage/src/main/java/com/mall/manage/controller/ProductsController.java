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
import com.mall.manage.domain.Products;
import com.mall.manage.service.IProductsService;
import com.mall.common.utils.poi.ExcelUtil;
import com.mall.common.core.page.TableDataInfo;

/**
 * 商品管理Controller
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
@RestController
@RequestMapping("/manage/products")
public class ProductsController extends BaseController
{
    @Autowired
    private IProductsService productsService;

    /**
     * 查询商品管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:products:list')")
    @GetMapping("/list")
    public TableDataInfo list(Products products)
    {
        startPage();
        List<Products> list = productsService.selectProductsList(products);
        return getDataTable(list);
    }

    /**
     * 导出商品管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:products:export')")
    @Log(title = "商品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Products products)
    {
        List<Products> list = productsService.selectProductsList(products);
        ExcelUtil<Products> util = new ExcelUtil<Products>(Products.class);
        util.exportExcel(response, list, "商品管理数据");
    }

    /**
     * 获取商品管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:products:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(productsService.selectProductsById(id));
    }

    /**
     * 新增商品管理
     */
    @PreAuthorize("@ss.hasPermi('manage:products:add')")
    @Log(title = "商品管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Products products)
    {
        return toAjax(productsService.insertProducts(products));
    }

    /**
     * 修改商品管理
     */
    @PreAuthorize("@ss.hasPermi('manage:products:edit')")
    @Log(title = "商品管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Products products)
    {
        return toAjax(productsService.updateProducts(products));
    }

    /**
     * 删除商品管理
     */
    @PreAuthorize("@ss.hasPermi('manage:products:remove')")
    @Log(title = "商品管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(productsService.deleteProductsByIds(ids));
    }
}
