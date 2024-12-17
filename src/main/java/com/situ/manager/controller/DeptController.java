package com.situ.manager.controller;

import com.situ.manager.mapper.DeptMapper;
import com.situ.manager.pojo.Dept;
import com.situ.manager.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    private DeptService deptService;

    // /admin/list
    @RequestMapping("/list")
    @ResponseBody
    public List<Dept> list() {
        //soutm
        System.out.println("DeptController.list");
        List<Dept> list = deptService.list();
        return list;
    }
}
