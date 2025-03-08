package com.mall.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.manage.mapper.BannersMapper;
import com.mall.manage.domain.Banners;
import com.mall.manage.service.IBannersService;

/**
 * 轮播图Service业务层处理
 * 
 * @author misuzu
 * @date 2025-02-26
 */
@Service
public class BannersServiceImpl implements IBannersService 
{
    @Autowired
    private BannersMapper bannersMapper;

    /**
     * 查询轮播图
     * 
     * @param id 轮播图主键
     * @return 轮播图
     */
    @Override
    public Banners selectBannersById(Integer id)
    {
        return bannersMapper.selectBannersById(id);
    }

    /**
     * 查询轮播图列表
     * 
     * @param banners 轮播图
     * @return 轮播图
     */
    @Override
    public List<Banners> selectBannersList(Banners banners)
    {
        return bannersMapper.selectBannersList(banners);
    }

    /**
     * 新增轮播图
     * 
     * @param banners 轮播图
     * @return 结果
     */
    @Override
    public int insertBanners(Banners banners)
    {
        return bannersMapper.insertBanners(banners);
    }

    /**
     * 修改轮播图
     * 
     * @param banners 轮播图
     * @return 结果
     */
    @Override
    public int updateBanners(Banners banners)
    {
        return bannersMapper.updateBanners(banners);
    }

    /**
     * 批量删除轮播图
     * 
     * @param ids 需要删除的轮播图主键
     * @return 结果
     */
    @Override
    public int deleteBannersByIds(Integer[] ids)
    {
        return bannersMapper.deleteBannersByIds(ids);
    }

    /**
     * 删除轮播图信息
     * 
     * @param id 轮播图主键
     * @return 结果
     */
    @Override
    public int deleteBannersById(Integer id)
    {
        return bannersMapper.deleteBannersById(id);
    }
}
