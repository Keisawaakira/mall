package com.train.mall.controller;

import com.train.mall.common.api.CommonResult;
import com.train.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "UmsMemberController", description = "会员登陆注册管理")
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @ResponseBody
    @GetMapping(value = "/getAuthCode")
    @ApiOperation("获取验证码")
    public CommonResult getAuthCode(@RequestParam String telephone){
        return umsMemberService.generateAuthCode(telephone);
    }

    @ResponseBody
    @PostMapping("/verifyAuthCode")
    @ApiOperation("判断验证码是否正确")
    public CommonResult updatePassword(@RequestParam String telephone,@RequestParam String authCode){
        return umsMemberService.verifyAuthCode(telephone,authCode);
    }
}
