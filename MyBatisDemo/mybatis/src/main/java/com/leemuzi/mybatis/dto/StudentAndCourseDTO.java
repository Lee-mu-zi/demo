package com.leemuzi.mybatis.dto;

import com.leemuzi.mybatis.domain.Course;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class StudentAndCourseDTO {

    private Integer id;

    private String name;

    private Integer gender;

    private Integer age;

    private String className;

    private LocalDate enrollmentDate;

    private String email;

    private String phone;

    private String address;

    private List<Course> courseList;
}
