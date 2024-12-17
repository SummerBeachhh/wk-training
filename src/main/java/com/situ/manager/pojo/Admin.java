package com.situ.manager.pojo;

import lombok.Data;

@Data
public class Admin {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private String email;
    private String phone;
    private String image;
    private Integer deptId;


}
