package com.tc51.util;

import com.tc51.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class RedisUser {

    private static List<User> list=new ArrayList<User>();

    public static List<User> getUserList(){

        return  list;
    }

    public static void setData(User user){

        list.add(user);
    }


}
