package com.situ.manager.controller;

import com.situ.manager.mapper.AdminMapper;
import com.situ.manager.pojo.Admin;
import com.situ.manager.pojo.query.AdminQuery;
import com.situ.manager.service.AdminService;
import com.situ.manager.util.PageResult;
import com.situ.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/admin")
public class AdminController {
    //注入过来使用
    //@Autowired
    //private AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;

    // /admin/list
//    @RequestMapping("/list")
//    @ResponseBody
//    public List<Admin> list() {
//        //soutm
//        System.out.println("AdminController.list");
//        List<Admin> list = adminService.list();
//        return list;
//    }
    @RequestMapping("/list")
    @ResponseBody
    public PageResult list(AdminQuery adminQuery) {
        System.out.println("AdminController.list");
        PageResult pageResult = adminService.list(adminQuery);
        return pageResult;
    }


    @RequestMapping("/toAdminList")
    public String toAdminList() {
        return "admin_list";
    }
    @RequestMapping("/toAdminAdd")
    public String toAdminAdd() {
        return "admin_add";
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //Alt+Enter
        adminService.deleteById(id);
        return Result.ok("删除成功");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(Admin admin) {
        adminService.add(admin);
        return Result.ok("添加成功");
    }
}

