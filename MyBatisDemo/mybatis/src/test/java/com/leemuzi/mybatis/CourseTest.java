package com.leemuzi.mybatis;

import com.leemuzi.mybatis.domain.Teacher;
import com.leemuzi.mybatis.dto.CourseAndTeacherDTO;
import com.leemuzi.mybatis.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseTest {
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void selectCourseAndTeacherByIdTest() {
        CourseAndTeacherDTO courseAndTeacherDTO = courseMapper.selectCourseAndTeacherById(1);
        Teacher teacher = courseAndTeacherDTO.getTeacher();
        System.out.println(teacher);
    }
}
