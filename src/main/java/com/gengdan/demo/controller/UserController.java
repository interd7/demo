package com.gengdan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/9/15 09:00
 */

@Controller
public class UserController {

    @RequestMapping("login")
    String showLoginForm(){
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
