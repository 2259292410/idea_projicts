package com.test;

import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MembersinfoDaoImplTest {

    private MembersinfoDao membersinfoDao = new MembersinfoDaoImpl();
    @Test
    public void queryList() {
    }

    @Test
    public void queryUserById() {
    }

    @Test
    public void update() {
        membersinfoDao.update(new Membersinfo(1,"1","1","1","1","1"));
    }

    @Test
    public void delete() {
    }
}