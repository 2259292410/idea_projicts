package com.test;

import com.entity.ShopCar;
import com.entity.ShopCarItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ShopCarTest {



    @Test
    public void addItem() {
        ShopCar shopCar = new ShopCar();
        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000),""));
        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000),""));
        shopCar.addItem(new ShopCarItem(2, "数据结构与算法", 1, new BigDecimal(100),new BigDecimal(100),""));

        System.out.println(shopCar);
    }

    @Test
    public void deleteItem() {
        ShopCar shopCar = new ShopCar();

        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000),""));
        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000),""));
        shopCar.addItem(new ShopCarItem(2, "数据结构与算法", 1, new BigDecimal(100), new BigDecimal(100),""));
        shopCar.deleteItem(1);

        System.out.println(shopCar);
    }

    @Test
    public void clear() {
        ShopCar shopCar = new ShopCar();

        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000),""));
        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000),""));
       shopCar.clear();
        shopCar.addItem(new ShopCarItem(2, "数据结构与算法", 1, new BigDecimal(100), new BigDecimal(100),""));
        System.out.println(shopCar);


    }

    @Test
    public void updateCount() {
        ShopCar shopCar = new ShopCar();

        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000), new BigDecimal(1000),""));
        shopCar.addItem(new ShopCarItem(2, "数据结构与算法", 1, new BigDecimal(100), new BigDecimal(100),""));
    shopCar.updateCount(1,3);
        System.out.println(shopCar);




    }
}