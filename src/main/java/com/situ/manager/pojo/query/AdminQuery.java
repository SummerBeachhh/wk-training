package com.situ.manager.pojo.query;

import lombok.Data;

@Data
public class AdminQuery {
    //当前是第几页
    private Integer page;
    //每页有多少条
    private Integer limit;
    private String name;
    private Integer deptId;
    private String email;

}