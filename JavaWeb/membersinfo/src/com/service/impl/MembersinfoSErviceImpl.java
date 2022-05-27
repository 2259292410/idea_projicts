package com.service.impl;

import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;
import com.service.MembersinfoService;

import java.util.List;

public class MembersinfoSErviceImpl implements MembersinfoService {
    private MembersinfoDao membersinfoDao = new MembersinfoDaoImpl();

    public List<Membersinfo> queryList() {
        return membersinfoDao.queryList();
    }

    public Membersinfo queryUserById(int id) {
        return membersinfoDao.queryUserById(id);
    }

    public int update(Membersinfo membersinfo) {
        return membersinfoDao.update(membersinfo);
    }

    public int deleteMembersinfoById(Integer id) {
        return membersinfoDao.delete(id);
    }


}
