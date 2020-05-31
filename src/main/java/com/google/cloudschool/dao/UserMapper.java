package com.google.cloudschool.dao;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

	@Select("select count(*) from user where username = #{param1} and password = #{param2} ")
	int login(String username, String password);
}

