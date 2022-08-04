package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


@TableName("print_template_details2")
public class DomVo implements Serializable {
    private Integer id;
    private String type;
    private List<Map<String,String>> domList;

    public void setDomList(List<Map<String, String>> domList) {
        this.domList = domList;
    }

    public DomVo() {
    }

    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", domList='" + domList + '\'' +
                '}';
    }

    public DomVo(Integer id, String type, List<Map<String, String>> domList) {
        this.id = id;
        this.type = type;
        this.domList = domList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Map<String, String>> getDomList() {
        return domList;
    }
}

