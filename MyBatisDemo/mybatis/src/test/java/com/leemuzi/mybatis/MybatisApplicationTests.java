package com.leemuzi.mybatis;

import com.leemuzi.mybatis.domain.Student;
import com.leemuzi.mybatis.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private TestMapper testMapper;



    @Test
    void addTest(){
        Student student = Student.builder()
                .name("麻子")
                .gender(0)
                .age(18)
                .className("计算机2020级2班")
                .enrollmentDate(LocalDate.parse("2020-09-01"))
                .email("mazi@stu.com")
                .phone("13900139004")
                .address("北京市东城区")
                .build();
        testMapper.add(student);
    }



}
