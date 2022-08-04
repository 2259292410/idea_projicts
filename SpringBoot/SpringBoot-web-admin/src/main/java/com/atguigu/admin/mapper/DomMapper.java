package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Dom;

import java.util.List;

public interface DomMapper{

    List<Dom> getAllDom();

    Dom getDomListByType(String type);

    int addDom(Dom dom);

  int  deleteDomByType(String type);

    int updateDomById(Dom dom);
}
