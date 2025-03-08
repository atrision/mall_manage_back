package com.mall.manage.mapper;

import java.util.List;
import com.mall.manage.domain.Products;

/**
 * 商品管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
public interface ProductsMapper 
{
    /**
     * 查询商品管理
     * 
     * @param id 商品管理主键
     * @return 商品管理
     */
    public Products selectProductsById(Integer id);

    /**
     * 查询商品管理列表
     * 
     * @param products 商品管理
     * @return 商品管理集合
     */
    public List<Products> selectProductsList(Products products);

    /**
     * 新增商品管理
     * 
     * @param products 商品管理
     * @return 结果
     */
    public int insertProducts(Products products);

    /**
     * 修改商品管理
     * 
     * @param products 商品管理
     * @return 结果
     */
    public int updateProducts(Products products);

    /**
     * 删除商品管理
     * 
     * @param id 商品管理主键
     * @return 结果
     */
    public int deleteProductsById(Integer id);

    /**
     * 批量删除商品管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductsByIds(Integer[] ids);
}
