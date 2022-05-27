package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    @Select("select * from t_user")
    List<User> queryAll();
    User queryUserById(Integer id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    //选择全部用户实现分页
    List<User> selectUser(Map<String,Integer> map);
}
