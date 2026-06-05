package com.leemuzi.mybatis.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * 
 * @TableName student
 */
@Data
@Builder
public class Student {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 0:女, 1:男
     */
    private Integer gender;

    /**
     * 
     */
    private Integer age;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 入学日期
     */
    private LocalDate enrollmentDate;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String address;
}