package com.atguigu.admin.service;

import com.atguigu.admin.bean.Dom;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DomService {
  List<Dom> getAllDom();
  Dom getDomListByType(String type);
  int addDom(Dom dom);
  int deleteDomByType(String type);
  int updateDomById(Dom dom);
}
