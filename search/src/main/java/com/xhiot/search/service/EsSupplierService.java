package com.xhiot.search.service;

/**
 * @ClassName EsSupplierService
 * Create by Liuyq on 2019/12/17 8:30
 **/
public interface EsSupplierService {

    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据关键字搜索名称
     */
//    Page<EsSupplier> search(String keywords, Integer pageNum, Integer pageSize);
}
