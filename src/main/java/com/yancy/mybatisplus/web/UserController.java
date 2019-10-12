package com.yancy.mybatisplus.web;

import com.yancy.mybatisplus.entity.User;
import com.yancy.mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public  String hello() {
//        User user = userMapper.selectById(1);
//        System.out.println(user);
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return userList.toString();
    }
}
