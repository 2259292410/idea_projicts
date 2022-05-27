package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getAllUser();
    int insertUser(User user);
    @MapKey("id")
    Map<String,Object> getAllUSerToMap();
}
