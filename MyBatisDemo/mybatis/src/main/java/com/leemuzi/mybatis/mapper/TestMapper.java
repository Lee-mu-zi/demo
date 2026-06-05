package com.leemuzi.mybatis.mapper;


import com.leemuzi.mybatis.domain.Student;

public interface TestMapper {
    int count();

    int add(Student student);
}
