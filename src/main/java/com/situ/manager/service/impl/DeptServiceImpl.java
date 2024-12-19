package com.situ.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.manager.mapper.DeptMapper;
import com.situ.manager.pojo.Dept;
import com.situ.manager.pojo.query.DeptQuery;
import com.situ.manager.service.DeptService;
import com.situ.manager.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public PageResult list(DeptQuery deptQuery) {
        //开启分页
        PageHelper.startPage(deptQuery.getPage(), deptQuery.getLimit());
        //查找当前页的数据
        //List<Dept> list = deptMapper.list();
        List<Dept> list = deptMapper.list(deptQuery);
        PageInfo pageInfo = new PageInfo(list);
        //总的数量
//        int totaltCount = (int) pageInfo.getTotal();
//        return new PageResult(0, "", totaltCount, list);
        int totalCount = (int) pageInfo.getTotal();
        return new PageResult(0, "", totalCount, list);
    }

    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }
    @Override
    public void add(Dept dept) {
        deptMapper.add(dept);
    }
    @Override
    public void deleteAll(Integer[] ids) {
        //delete from student where id in(2,3,45)
        for (Integer id : ids) {
            deptMapper.deleteById(id);
        }
    }
}