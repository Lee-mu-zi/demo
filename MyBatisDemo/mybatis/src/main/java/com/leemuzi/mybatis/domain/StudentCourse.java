package com.leemuzi.mybatis.domain;


import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName student_course
 */
@Data
public class StudentCourse {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer studentId;

    /**
     * 
     */
    private Integer courseId;

    /**
     * 成绩
     */
    private BigDecimal score;

    /**
     * 学期
     */
    private String semester;

    /**
     * 学年
     */
    private String academicYear;
}