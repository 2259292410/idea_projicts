package com.test;

import com.dao.impl.ManagerDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerDaoImplTest {

    @Test
    public void queryManagerByManagernameAndPassword() {
        System.out.println(new ManagerDaoImpl().queryManagerByManagernameAndPassword("advin", "admin"));
    }
}