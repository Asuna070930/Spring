package com.atguigu.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {
    private Integer id;
    private String lastName;
    private Integer gender;
    // 日期类型  2022-7-28  >>> date
    // 接收非JSON数据转换日期格式注解
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    // 接收/响应JSON数据日期转换格式注解
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String email;
    private Double salary;
    private Integer gradeId;
    // 关联对应的部门对象
    private Grade grade;
}
