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
import com.mall.manage.domain.Users;
import com.mall.manage.service.IUsersService;
import com.mall.common.utils.poi.ExcelUtil;
import com.mall.common.core.page.TableDataInfo;

/**
 * 用户管理Controller
 * 
 * @author misuzu
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/manage/users")
public class UsersController extends BaseController
{
    @Autowired
    private IUsersService usersService;

    /**
     * 查询用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:users:list')")
    @GetMapping("/list")
    public TableDataInfo list(Users users)
    {
        startPage();
        List<Users> list = usersService.selectUsersList(users);
        return getDataTable(list);
    }

    /**
     * 导出用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:users:export')")
    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Users users)
    {
        List<Users> list = usersService.selectUsersList(users);
        ExcelUtil<Users> util = new ExcelUtil<Users>(Users.class);
        util.exportExcel(response, list, "用户管理数据");
    }

    /**
     * 获取用户管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:users:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(usersService.selectUsersById(id));
    }

    /**
     * 新增用户管理
     */
    @PreAuthorize("@ss.hasPermi('manage:users:add')")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Users users)
    {
        return toAjax(usersService.insertUsers(users));
    }

    /**
     * 修改用户管理
     */
    @PreAuthorize("@ss.hasPermi('manage:users:edit')")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Users users)
    {
        return toAjax(usersService.updateUsers(users));
    }

    /**
     * 删除用户管理
     */
    @PreAuthorize("@ss.hasPermi('manage:users:remove')")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(usersService.deleteUsersByIds(ids));
    }
}
