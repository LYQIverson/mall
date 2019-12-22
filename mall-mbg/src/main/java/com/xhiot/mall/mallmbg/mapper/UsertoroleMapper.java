package com.xhiot.mall.mallmbg.mapper;

import com.xhiot.mall.mallmbg.model.Usertorole;
import com.xhiot.mall.mallmbg.model.UsertoroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertoroleMapper {
    long countByExample(UsertoroleExample example);

    int deleteByExample(UsertoroleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Usertorole record);

    int insertSelective(Usertorole record);

    List<Usertorole> selectByExample(UsertoroleExample example);

    Usertorole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Usertorole record, @Param("example") UsertoroleExample example);

    int updateByExample(@Param("record") Usertorole record, @Param("example") UsertoroleExample example);

    int updateByPrimaryKeySelective(Usertorole record);

    int updateByPrimaryKey(Usertorole record);
}