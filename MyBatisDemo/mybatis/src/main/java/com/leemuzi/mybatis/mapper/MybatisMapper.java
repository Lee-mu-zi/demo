package com.leemuzi.mybatis.mapper;

import com.leemuzi.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface MybatisMapper {

    int count();

    User getUser(int id);

    boolean createUser(@Param("users") User user);

    boolean updateUser(User user);
}
