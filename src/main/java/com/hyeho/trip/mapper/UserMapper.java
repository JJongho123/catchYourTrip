package com.hyeho.trip.mapper;

import com.hyeho.trip.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUserList();
}
