package com.mall.manage.mapper;

import java.util.List;
import com.mall.manage.domain.Banners;

/**
 * 轮播图Mapper接口
 * 
 * @author misuzu
 * @date 2025-02-26
 */
public interface BannersMapper 
{
    /**
     * 查询轮播图
     * 
     * @param id 轮播图主键
     * @return 轮播图
     */
    public Banners selectBannersById(Integer id);

    /**
     * 查询轮播图列表
     * 
     * @param banners 轮播图
     * @return 轮播图集合
     */
    public List<Banners> selectBannersList(Banners banners);

    /**
     * 新增轮播图
     * 
     * @param banners 轮播图
     * @return 结果
     */
    public int insertBanners(Banners banners);

    /**
     * 修改轮播图
     * 
     * @param banners 轮播图
     * @return 结果
     */
    public int updateBanners(Banners banners);

    /**
     * 删除轮播图
     * 
     * @param id 轮播图主键
     * @return 结果
     */
    public int deleteBannersById(Integer id);

    /**
     * 批量删除轮播图
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBannersByIds(Integer[] ids);
}
