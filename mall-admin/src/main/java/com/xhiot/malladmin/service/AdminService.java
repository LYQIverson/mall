package com.xhiot.malladmin.service;


import com.xhiot.mall.mallmbg.model.User;
import com.xhiot.mall.mallmbg.model.UserPermission;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName AdminService
 **/
@Component
public interface AdminService {

    /**
     * 根据用户名获取后台管理员
     */
    User getAdminByUsername(String username);

    /**
     * 用户登陆
     *
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UserPermission> getPermissionList(String adminId);

}
