package com.leemuzi.mybatis.dto;

import com.leemuzi.mybatis.domain.Teacher;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DepartmentAndTeachersDTO {

    private Integer id;

    private String name;

    private Integer deanId;

    private String location;

    private Date establishDate;

    private List<Teacher> teachers;
}
