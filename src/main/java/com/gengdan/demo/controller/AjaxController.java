package com.gengdan.demo.controller;

import com.gengdan.demo.entity.JSONUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by inter.d on 2020/11/3 9:15 上午
 * @author inter.d
 */
@Controller
@RequestMapping("user")
public class AjaxController {
    @RequestMapping(value = "loginActionAJAXJSON",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> loginActionAJAXJSON(@RequestBody JSONUser jsonUser){
        System.out.println("userName="+ jsonUser.getUsername());
        System.out.println("userPassword=" +jsonUser.getPassword());
        Map<String,String> selectedMap = new HashMap<>();
        selectedMap.put("selectedResult","success!");
        selectedMap.put("selectedRows","1");
        return selectedMap;
    }
    @GetMapping("login")
    String showLoginForm(){
        System.out.println("showLoginForm");
        return "loginAJAX";
    }

}
