package com.situ.manager.controller;

import com.situ.manager.mapper.DeptMapper;
import com.situ.manager.pojo.Dept;
import com.situ.manager.pojo.query.DeptQuery;
import com.situ.manager.service.DeptService;
import com.situ.manager.util.PageResult;
import com.situ.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/dept")
public class DeptController {
    //注入过来使用
    //@Autowired
    //private DeptMapper deptMapper;
    @Autowired
    private DeptService deptService;

    // /dept/list
//    @RequestMapping("/list")
//    @ResponseBody
//    public List<Dept> list() {
//        //soutm
//        System.out.println("DeptController.list");
//        List<Dept> list = deptService.list();
//        return list;
//    }
    @RequestMapping("/list")
    @ResponseBody
    public PageResult list(DeptQuery deptQuery) {
        System.out.println("DeptController.list");
        PageResult pageResult = deptService.list(deptQuery);
        return pageResult;
    }


    @RequestMapping("/toDeptList")
    public String toDeptList() {
        return "dept_list";
    }
    @RequestMapping("/toDeptAdd")
    public String toDeptAdd() {
        return "dept_add";
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //Alt+Enter
        deptService.deleteById(id);
        return Result.ok("删除成功");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(Dept dept) {
        deptService.add(dept);
        return Result.ok("添加成功");
    }
    @RequestMapping("/deleteAll")
    @ResponseBody
    public Result deleteAll(Integer[] ids) {
        //Alt+Enter
        deptService.deleteAll(ids);
        return Result.ok("删除成功");
    }
}

