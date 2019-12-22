package com.xhiot.search.controller;

import com.xhiot.mallcommon.api.CommonResult;
import com.xhiot.search.service.EsSupplierService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName SupplierController
 * Create by Liuyq on 2019/12/16 17:06
 **/
@Controller
public class SupplierController {
    @Autowired
    private EsSupplierService esSupplierService;

    @ApiOperation(value = "导入所有数据库中供应商到ES")
    @RequestMapping(value = "/importAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> importAllList() {
        int count = esSupplierService.importAll();
        return CommonResult.success(count);
    }

//    @ApiOperation(value = "简单搜索")
//    @RequestMapping(value = "/search/simple",method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<CommonPage<EsSupplier>> search(@RequestParam(required = false)String keywords,
//                                           @RequestParam(required = false, defaultValue = "0") Integer pageNum,
//                                           @RequestParam(required = false, defaultValue = "5") Integer pageSize){
//        Page<EsSupplier> suppliers = esSupplierService.search(keywords,pageNum,pageSize);
//        return CommonResult.success(CommonPage.restPage(suppliers));
//    }


}
