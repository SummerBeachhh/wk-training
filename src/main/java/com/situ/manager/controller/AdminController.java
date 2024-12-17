package com.situ.manager.controller;

import com.situ.manager.mapper.AdminMapper;
import com.situ.manager.pojo.Admin;
import com.situ.manager.service.AdminService;
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
    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> list() {
        //soutm
        System.out.println("AdminController.list");
        List<Admin> list = adminService.list();
        return list;
    }
}
