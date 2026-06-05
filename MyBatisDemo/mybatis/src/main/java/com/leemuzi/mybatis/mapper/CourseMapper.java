package com.leemuzi.mybatis.mapper;

import com.leemuzi.mybatis.dto.CourseAndTeacherDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {

    CourseAndTeacherDTO selectCourseAndTeacherById(Integer id);

}
