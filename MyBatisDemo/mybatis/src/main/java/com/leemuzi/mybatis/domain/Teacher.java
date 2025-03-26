package com.leemuzi.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName teacher
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
     * 
     */
    private Integer id;

    /**
     * 教师名字
     */
    private String name;
}