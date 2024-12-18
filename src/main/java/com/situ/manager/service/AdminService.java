package com.situ.manager.service;

import com.situ.manager.pojo.Admin;
import com.situ.manager.pojo.query.AdminQuery;
import com.situ.manager.util.PageResult;

import java.util.List;

public interface AdminService {
    PageResult list(AdminQuery adminQuery);

    void deleteById(Integer id);
    void add(Admin admin);
}