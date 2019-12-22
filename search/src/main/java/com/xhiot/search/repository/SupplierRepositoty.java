package com.xhiot.search.repository;


import com.xhiot.search.domain.EsSupplier;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @ClassName SupplierRepositoty
 * Create by Liuyq on 2019/12/16 17:04
 **/
public interface SupplierRepositoty extends ElasticsearchRepository<EsSupplier,String> {

   /**
    * @Description 搜索查询
    * @Auther: liuyq
    * @Date: 2019/12/17 10:33
    * @param industry
    * @param page
    * @return org.springframework.data.domain.Page<com.xhiot.mallsearch.domain.EsSupplier>
    **/
//    Page<EsSupplier> findByNameOrSubTitleOrKeywords(String industry, Pageable page);

}
