package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    private Integer id;
    private String name;
    private Integer age;
    private String email;

}
