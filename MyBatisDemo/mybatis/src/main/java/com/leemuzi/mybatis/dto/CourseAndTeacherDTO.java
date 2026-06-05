package com.leemuzi.mybatis.dto;

import com.leemuzi.mybatis.domain.Teacher;
import lombok.Data;

@Data
public class CourseAndTeacherDTO {

    private Integer id;

    private String name;

    private Integer credit;

    private Integer hours;

    private String description;

    private Teacher teacher;
}
