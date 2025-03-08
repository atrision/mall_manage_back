package com.mall.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.manage.mapper.UsersMapper;
import com.mall.manage.domain.Users;
import com.mall.manage.service.IUsersService;

/**
 * 用户管理Service业务层处理
 * 
 * @author misuzu
 * @date 2025-03-05
 */
@Service
public class UsersServiceImpl implements IUsersService 
{
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询用户管理
     * 
     * @param id 用户管理主键
     * @return 用户管理
     */
    @Override
    public Users selectUsersById(Integer id)
    {
        return usersMapper.selectUsersById(id);
    }

    /**
     * 查询用户管理列表
     * 
     * @param users 用户管理
     * @return 用户管理
     */
    @Override
    public List<Users> selectUsersList(Users users)
    {
        return usersMapper.selectUsersList(users);
    }

    /**
     * 新增用户管理
     * 
     * @param users 用户管理
     * @return 结果
     */
    @Override
    public int insertUsers(Users users)
    {
        return usersMapper.insertUsers(users);
    }

    /**
     * 修改用户管理
     * 
     * @param users 用户管理
     * @return 结果
     */
    @Override
    public int updateUsers(Users users)
    {
        return usersMapper.updateUsers(users);
    }

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteUsersByIds(Integer[] ids)
    {
        return usersMapper.deleteUsersByIds(ids);
    }

    /**
     * 删除用户管理信息
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteUsersById(Integer id)
    {
        return usersMapper.deleteUsersById(id);
    }
}
