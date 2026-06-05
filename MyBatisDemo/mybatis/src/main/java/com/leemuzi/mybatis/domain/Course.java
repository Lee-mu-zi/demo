package com.leemuzi.mybatis.domain;


import lombok.Data;

/**
 * 
 * @TableName course
 */
@Data
public class Course {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 学分
     */
    private Integer credit;

    /**
     * 课时
     */
    private Integer hours;

    /**
     * 授课教师ID
     */
    private Integer teacherId;

    /**
     * 
     */
    private String description;
}