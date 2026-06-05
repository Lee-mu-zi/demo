package com.leemuzi.mybatis.mapper;

import com.leemuzi.mybatis.dto.DepartmentAndTeachersDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

    DepartmentAndTeachersDTO selectDepartmentAndTeachersById(Integer departmentId);
}
