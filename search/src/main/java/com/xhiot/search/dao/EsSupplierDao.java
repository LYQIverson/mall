package com.xhiot.search.dao;

import com.xhiot.search.domain.EsSupplier;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * @ClassName EsSupplierDao
 * Create by Liuyq on 2019/12/17 8:35
 **/
public interface EsSupplierDao {
    List<EsSupplier> getAllEsSupplierList(@Param("id") String id);
}
