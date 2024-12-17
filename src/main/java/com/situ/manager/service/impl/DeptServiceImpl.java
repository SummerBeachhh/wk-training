package com.situ.manager.service.impl;

import com.situ.manager.mapper.DeptMapper;
import com.situ.manager.pojo.Dept;
import com.situ.manager.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
