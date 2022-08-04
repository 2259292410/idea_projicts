package com.atguigu.admin.service.impl;

import com.atguigu.admin.bean.Dom;
import com.atguigu.admin.mapper.DomMapper;
import com.atguigu.admin.service.DomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DomServiceImpl implements DomService {
    @Resource
    DomMapper domMapper;

    @Override
    public int deleteDomByType(String type) {
        return domMapper.deleteDomByType(type);
    }

    @Override
    public int updateDomById(Dom dom) {
        return domMapper.updateDomById(dom);
    }

    @Override
    public int addDom(Dom dom) {
        return domMapper.addDom(dom);
    }

    @Override
    public List<Dom> getAllDom() {
        return domMapper.getAllDom();
    }

    @Override
    public Dom getDomListByType(String type) {
        return domMapper.getDomListByType(type);
    }
}
