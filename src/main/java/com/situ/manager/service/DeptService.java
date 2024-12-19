package com.situ.manager.service;

import com.situ.manager.pojo.Dept;
import com.situ.manager.pojo.query.DeptQuery;
import com.situ.manager.util.PageResult;

import java.util.List;

public interface DeptService {
    PageResult list(DeptQuery deptQuery);

    void deleteById(Integer id);
    void add(Dept dept);
    void deleteAll(Integer[] ids);
}