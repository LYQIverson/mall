package com.xhiot.malladmin.dao;

import com.xhiot.mall.mallmbg.model.UserPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 *@ClassName UserToRoleDao
 * Create by Liuyq on 2019/12/12 9:27
 **/
public interface UserToRoleDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UserPermission> getPermissionList(@Param("adminId") String adminId);
}
