package com.gengdan.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/9/15 09:00
 */

@Controller
@Api(value = "用户管理", tags = "用户API")
public class UserController {

    @ApiOperation(value = "登录测试（POST）", notes = "登录测试（POST）")
    @RequestMapping(value = "login",method = RequestMethod.POST)
    String showLoginForm(){
        System.out.println("showLoginForm");
        return "login";
    }

    @ApiOperation(value = "登录测试（GET）", notes = "登录测试（GET）")
    @RequestMapping(value = "login2",method = RequestMethod.GET)
    String showLoginForm2(){
        System.out.println("showLoginForm");
        return "login";
    }

    @ApiOperation(value = "登录测试（GET）", notes = "登录测试（GET）")
    @GetMapping("login3")
    String showLoginForm3(){
        System.out.println("showLoginForm");
        return "login";
    }

    @ApiOperation(value = "登录测试（POST）", notes = "登录测试（POST）")
    @PostMapping("login4")
    String showLoginForm4(){
        System.out.println("showLoginForm");
        return "login";
    }

    @GetMapping("loginAction")
    String loginAction(@RequestParam("username") String userName,
                       @RequestParam("password") String userPassword, Model model){
        String textUserNameValue="pig";
        String testUserPasswordValue="123456";
        if(userName.equals(textUserNameValue) && userPassword.equals(testUserPasswordValue)){
            return "loginSuccess";
        }
        return "login";
    }


}
