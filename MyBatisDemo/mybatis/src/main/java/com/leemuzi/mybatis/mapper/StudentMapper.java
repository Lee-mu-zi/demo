package com.leemuzi.mybatis.mapper;

import com.leemuzi.mybatis.dto.StudentAndCourseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<StudentAndCourseDTO> selectAll();

}
