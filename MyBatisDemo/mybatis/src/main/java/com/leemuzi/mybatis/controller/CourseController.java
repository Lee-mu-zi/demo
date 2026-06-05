package com.leemuzi.mybatis.controller;

import com.leemuzi.mybatis.dto.StudentAndCourseDTO;
import com.leemuzi.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    public StudentMapper studentMapper;

    @GetMapping("/get")
    public List<StudentAndCourseDTO> selectAll() {
        return studentMapper.selectAll();
    }
}
