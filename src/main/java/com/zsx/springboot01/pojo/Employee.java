package com.zsx.springboot01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String email;
    private String  gender;
    private Department department;
    private String departmentName;
    private Date birth;

}
