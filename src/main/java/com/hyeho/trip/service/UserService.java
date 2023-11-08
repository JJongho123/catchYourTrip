package com.hyeho.trip.service;

import com.hyeho.trip.mapper.UserMapper;
import com.hyeho.trip.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
