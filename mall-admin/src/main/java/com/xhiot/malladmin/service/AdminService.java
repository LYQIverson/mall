package com.xhiot.malladmin.service;


import com.xhiot.mall.mallmbg.model.User;
import org.springframework.stereotype.Component;

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
     * @param username
     * @param password
     * @return
     */
    String login(String username,String password);

}
