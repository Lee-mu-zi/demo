package com.leemuzi.mybatis.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 
 * @TableName teacher
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private Integer id;

    private String name;

    private Integer gender;

    private Integer age;

    private String title;

    private String department;

    private String email;

    private String phone;

    private LocalDate hireDate;
}