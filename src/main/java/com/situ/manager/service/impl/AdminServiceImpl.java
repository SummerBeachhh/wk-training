package com.situ.manager.service.impl;

import com.situ.manager.mapper.AdminMapper;
import com.situ.manager.pojo.Admin;
import com.situ.manager.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> list() {
        return adminMapper.list();
    }
}
