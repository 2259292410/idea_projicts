package com.test;

import com.entity.Manager;
import com.service.impl.ManagerServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerServiceImplTest {

    @Test
    public void login() {
        System.out.println(new ManagerServiceImpl().login(new Manager(null, "asmin", "admin")));
    }
}