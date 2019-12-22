package com.xhiot.mall.mallmbg.mapper;

import com.xhiot.mall.mallmbg.model.UserPermission;
import com.xhiot.mall.mallmbg.model.UserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPermissionMapper {
    long countByExample(UserPermissionExample example);

    int deleteByExample(UserPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserPermission record);

    int insertSelective(UserPermission record);

    List<UserPermission> selectByExample(UserPermissionExample example);

    UserPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    int updateByExample(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    int updateByPrimaryKeySelective(UserPermission record);

    int updateByPrimaryKey(UserPermission record);
}