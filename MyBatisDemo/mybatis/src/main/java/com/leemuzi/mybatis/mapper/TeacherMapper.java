package com.leemuzi.mybatis.mapper;

import com.leemuzi.mybatis.domain.Teacher;
import com.leemuzi.mybatis.dto.TeacherTitleCountDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherMapper {
    //增加一名教师
    int insertTeacher(Teacher teacher);

    //根据teacher id查询教师信息
    Teacher selectTeacherById(@Param("id") int id);

    // 根据id修改教师信息
    int updateTeacherById(Teacher teacher);

    // 根据id删除教师
    int deleteTeacherById(@Param("id") int id);

    // 分页查询教师信息
    List<Teacher> selectTeachersByLimit(@Param("limit") int limit, @Param("offset") int offset);

    // 统计每个职称的教师人数
    List<TeacherTitleCountDTO> countTeachersByTitle();

    // 范围查询教师信息
    List<Teacher> selectTeachersByRange(@Param("begin") int begin, @Param("end") int end);

    //

}
