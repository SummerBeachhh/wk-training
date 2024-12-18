package com.situ.manager.mapper;

import com.situ.manager.pojo.Admin;
import com.situ.manager.pojo.query.AdminQuery;

import java.util.List;

public interface AdminMapper {
    //List<Admin> list();
    List<Admin> list(AdminQuery adminQuery);
    void deleteById(int id);
    void add(Admin admin);
}
