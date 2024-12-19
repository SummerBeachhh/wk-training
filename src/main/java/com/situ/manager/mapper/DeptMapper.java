package com.situ.manager.mapper;

import com.situ.manager.pojo.Dept;
import com.situ.manager.pojo.query.DeptQuery;

import java.util.List;

public interface DeptMapper {
    //List<Dept> list();
    List<Dept> list(DeptQuery deptQuery);
    void deleteById(int id);
    void add(Dept dept);
}