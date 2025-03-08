package com.mall.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.manage.mapper.ProductsMapper;
import com.mall.manage.domain.Products;
import com.mall.manage.service.IProductsService;

/**
 * 商品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
@Service
public class ProductsServiceImpl implements IProductsService 
{
    @Autowired
    private ProductsMapper productsMapper;

    /**
     * 查询商品管理
     * 
     * @param id 商品管理主键
     * @return 商品管理
     */
    @Override
    public Products selectProductsById(Integer id)
    {
        return productsMapper.selectProductsById(id);
    }

    /**
     * 查询商品管理列表
     * 
     * @param products 商品管理
     * @return 商品管理
     */
    @Override
    public List<Products> selectProductsList(Products products)
    {
        return productsMapper.selectProductsList(products);
    }

    /**
     * 新增商品管理
     * 
     * @param products 商品管理
     * @return 结果
     */
    @Override
    public int insertProducts(Products products)
    {
        return productsMapper.insertProducts(products);
    }

    /**
     * 修改商品管理
     * 
     * @param products 商品管理
     * @return 结果
     */
    @Override
    public int updateProducts(Products products)
    {
        return productsMapper.updateProducts(products);
    }

    /**
     * 批量删除商品管理
     * 
     * @param ids 需要删除的商品管理主键
     * @return 结果
     */
    @Override
    public int deleteProductsByIds(Integer[] ids)
    {
        return productsMapper.deleteProductsByIds(ids);
    }

    /**
     * 删除商品管理信息
     * 
     * @param id 商品管理主键
     * @return 结果
     */
    @Override
    public int deleteProductsById(Integer id)
    {
        return productsMapper.deleteProductsById(id);
    }
}
