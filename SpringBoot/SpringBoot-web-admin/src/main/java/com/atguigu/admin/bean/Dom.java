package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.Serializable;


@TableName("print_template_details2")
@Data
public class Dom implements Serializable {
    private Integer id;
    private String type;
    private String domList;
}

