package com.xhiot.malladmin.controller;

import com.xhiot.malladmin.dto.AdminLoginParam;
import com.xhiot.malladmin.service.AdminService;
import com.xhiot.mallcommon.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 后台用户管理
 * @ClassName LoginController
 **/
@RestController
@Api(tags = "AdminController" , description = "后台用户管理")
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead")
    private String tokenHead;

    @ApiOperation(value = "登陆以后返回token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login( AdminLoginParam adminLoginParam, BindingResult result){
        System.out.println("请求登陆接口::");
        System.out.println("adminLoginParam.getUsername()==="+adminLoginParam.getUsername()+".adminLoginParam.getPassord()="+adminLoginParam.getPassword());
        String encodePassword = passwordEncoder.encode(adminLoginParam.getPassword());
        System.out.println("密码为："+encodePassword);
        String token = adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword());
        if(token == null){
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult.success(tokenMap);
    }

}
