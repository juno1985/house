package com.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.house.common.model.User;

@Mapper
public interface UserMapper {

	public List<User> selectUsers();
}
