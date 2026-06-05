package com.leemuzi.mybatis;

import com.leemuzi.mybatis.domain.Teacher;
import com.leemuzi.mybatis.dto.TeacherTitleCountDTO;
import com.leemuzi.mybatis.mapper.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class TeacherTests {
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void insertTeacherTest() {
        Teacher build = Teacher.builder()
                .id(4)
                .name("赵教授")
                .gender(0)
                .age(40)
                .title("教授")
                .department("软件工程")
                .email("zhao@edu.com")
                .phone("13800138004")
                .hireDate(LocalDate.parse("2016-08-09"))
                .build();
        int id = teacherMapper.insertTeacher(build);
    }

    @Test
    public void selectTeacherByIdTest() {
        Teacher teacher = teacherMapper.selectTeacherById(1);
        System.out.println(teacher);
    }

    @Test
    public void updateTeacherByIdTest() {
        Teacher build = Teacher.builder()
                .id(4)
                .name("赵教授(改)")
                .age(46)
                .hireDate(LocalDate.parse("2026-08-09"))
                .build();
        teacherMapper.updateTeacherById(build);
    }

    @Test
    public void deleteTeacherByIdTest() {
        int i = teacherMapper.deleteTeacherById(4);
        System.out.println(i);
    }

    @Test
    public void selectTeachersByLimitTest() {
        List<Teacher> teachers = teacherMapper.selectTeachersByLimit(10,20);
    }

    @Test
    public void countTeachersByTitleTest() {
        List<TeacherTitleCountDTO> teacherTitleCountDTOS = teacherMapper.countTeachersByTitle();
    }

    @Test
    public void selectTeachersByRangeTest() {
        List<Teacher> teachers = teacherMapper.selectTeachersByRange(35, 45);
    }


}
