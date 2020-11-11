package com.gengdan.demo.controller;

import com.gengdan.demo.entity.JSONPage;
import com.gengdan.demo.entity.Stu;
import com.gengdan.demo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by inter.d on 2020/11/10 2:49 下午
 * @author inter.d
 */
@org.springframework.stereotype.Controller
@RequestMapping("student")
public class StudentInfoController {
    final StudentService studentService;
    public StudentInfoController(StudentService studentService){
        this.studentService = studentService;
    }
    @RequestMapping(value = "myStudentInfo",method = RequestMethod.POST)
    public @ResponseBody
    PageInfo<Stu> myStudentInfo(@RequestBody JSONPage pageInfo){
        /**
         * description:
         *@param: [pageInfo]
         *@return: com.github.pagehelper.PageInfo<com.gengdan.demo.entity.Stu>
         *@author YimaiDuan
         *@date 2020/11/10
         */
        PageHelper.startPage(pageInfo.getPageNumber(),
                pageInfo.getPageSize());
        List<Stu> all = studentService.findAllStudent();
        PageInfo<Stu> studentinfo = new PageInfo(all);
        return studentinfo;
    }
    @GetMapping("ShowStudentInfo")
    String showPage(){
        System.out.println("showStudentInfo");
        return "showStudentInfoJSON";
    }
}
