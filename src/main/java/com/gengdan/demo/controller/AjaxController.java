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
        selectedMap.put("selectedResult", jsonUser.getUsername());
        selectedMap.put("selectedRows",jsonUser.getPassword());
        return selectedMap;
    }
//    @RequestMapping(value = "loginActionAJAXSomeJSON",method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String,String> loginActionAJAXSomeJSON(@RequestBody JSONUser jsonUser){
//        System.out.println("userName="+ jsonUser.getUsername());
//        System.out.println("userPassword=" +jsonUser.getPassword());
//        // 查询代码
//        Map<String,String> selectedMap1 = new HashMap<>();
//        selectedMap1.put("selectedResult","success!");
//        selectedMap1.put("selectedRows","1");
//
//        Map<String,String> selectedMap2 = new HashMap<>();
//        selectedMap2.put("selectedResult","hisSuccess!");
//        selectedMap2.put("selectedRows","12");
//        List<Map<String, String>> mapList = new ArrayList<>();
//        mapList.add(selectedMap1);
//        mapList.add(selectedMap2);
//        return mapList;
//    }
    @GetMapping("login")
    String showLoginForm(){
        System.out.println("showLoginForm");
        return "loginAJAX";
    }

}
