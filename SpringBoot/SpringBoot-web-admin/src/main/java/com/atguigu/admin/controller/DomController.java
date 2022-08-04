package com.atguigu.admin.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.atguigu.admin.bean.Dom;
import com.atguigu.admin.bean.DomVo;
import com.atguigu.admin.service.DomService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class DomController {
    @Autowired
    DomService domService;

    @GetMapping("/list")
    public List<DomVo> list(){
        List<DomVo> domVos = new ArrayList<DomVo>();
        List<Dom> allDom = domService.getAllDom();
        if(allDom!=null){
            allDom.forEach(i->{
                List<Map<String,String>> listObjectFir = (List<Map<String,String>>) JSONArray.parse(i.getDomList());
                DomVo domVo = new DomVo();
                domVo.setType(i.getType());
                domVo.setId(i.getId());
                domVo.setDomList(listObjectFir);
                domVos.add(domVo);
            });
        }
        return domVos;
    }


    @GetMapping("/get/{type}")
    public DomVo getDom(@PathVariable  String type){
        DomVo domVo = new DomVo();
         Dom dom= domService.getDomListByType(type);
         if (dom!=null) {
             //把json转成List<Map<String,String>>对象
             List<Map<String,String>> listObjectFir = (List<Map<String,String>>) JSONArray.parse(dom.getDomList());
             domVo.setType(dom.getType());
             domVo.setId(dom.getId());
             domVo.setDomList(listObjectFir);
         }
        return domVo;
    }

    @PostMapping("/add")
    public int addDom(Dom dom){
        return domService.addDom(dom);
    }

    @DeleteMapping("/delete/{type}")
    public int deleteDom(@PathVariable String type){
        return domService.deleteDomByType(type);
    }

    @PostMapping("/update")
    public int updateDom(Dom dom){
        return domService.updateDomById(dom);
    }


}
