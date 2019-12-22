package com.xhiot.search.service.impl;

import com.xhiot.search.dao.EsSupplierDao;
import com.xhiot.search.domain.EsSupplier;
import com.xhiot.search.repository.SupplierRepositoty;
import com.xhiot.search.service.EsSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName EsSupplierServiceImpl
 * Create by Liuyq on 2019/12/17 8:33
 **/
@Service
public class EsSupplierServiceImpl implements EsSupplierService {

    @Autowired
    private EsSupplierDao supplierDao;

    @Autowired
    private SupplierRepositoty supplierRepositoty;

    @Override
    public int importAll() {
        List<EsSupplier> esSuppliers = supplierDao.getAllEsSupplierList(null);
        System.out.println(esSuppliers.size());
        Iterable<EsSupplier> esSupplierIterable = supplierRepositoty.saveAll(esSuppliers);
        Iterator<EsSupplier> it = esSupplierIterable.iterator();
        int result = 0;
        while (it.hasNext()){
            result++;
            it.next();
        }
        return result;
    }

//    @Override
//    public Page<EsSupplier> search(String keywords, Integer pageNum, Integer pageSize) {
//        Pageable pageable = PageRequest.of(pageNum, pageSize);
//        return supplierRepositoty.findByNameOrSubTitleOrKeywords( keywords, pageable);
//    }
}
