package com.situ.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.manager.mapper.AdminMapper;
import com.situ.manager.pojo.Admin;
import com.situ.manager.pojo.query.AdminQuery;
import com.situ.manager.service.AdminService;
import com.situ.manager.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public PageResult list(AdminQuery adminQuery) {
        //开启分页
        PageHelper.startPage(adminQuery.getPage(), adminQuery.getLimit());
        //查找当前页的数据
        List<Admin> list = adminMapper.list();
        PageInfo pageInfo = new PageInfo(list);
        //总的数量
        int totaltCount = (int) pageInfo.getTotal();
        return new PageResult(0, "", totaltCount, list);
    }

    @Override
    public void deleteById(Integer id) {
        adminMapper.deleteById(id);
    }
}