package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;//列名 last_name
    private Integer gender;
    private String email;
    private Double salary;
    private Integer deptId;//列名 dept_id
}
