package com.entity;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShopCar {
/*
    private BigDecimal totalPrice;
    private Integer totalCount;
*/

    /**
     * key 是商品编号，
     * value，是商品信息
     */
    private Map<Integer, ShopCarItem> items = new LinkedHashMap<Integer, ShopCarItem>();

    public ShopCar() {
    }

    /**
     * 添加商品项
     *
     * @param shopCarItem
     */
    public void addItem(ShopCarItem shopCarItem) {
        ShopCarItem item = items.get(shopCarItem.getId());

        if (item == null) {
            items.put(shopCarItem.getId(), shopCarItem);
        } else {
            item.setCount(item.getCount() + 1);
            item.setTotalPrice(item.getPrice().multiply(new BigDecimal(item.getCount())));
        }
    }

    /**
      *
     * 删除商品项
     */ public void deleteItem(Integer id) {
        items.remove(id);
    }

    /**
     *  清空购物车
     */
    public void clear() { items.clear(); }

    /**
     * 修改商品数量
     * @param id
     * @param count
     */
    public void updateCount(Integer id,Integer count) {
        ShopCarItem item = items.get(id);
        if(item!=null) {
            item.setCount(count);
            item.setTotalPrice(item.getPrice().multiply(new BigDecimal(item.getCount())));
        }

    }
    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = new BigDecimal(0);

        for (Map.Entry<Integer, ShopCarItem> entry : items.entrySet()) {
            totalPrice = totalPrice.add(entry.getValue().getTotalPrice());
        }
        return totalPrice;
    }

/*    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }*/

    public Integer getTotalCount() {
        Integer totalCount =0;
        for (Map.Entry<Integer, ShopCarItem> entry : items.entrySet()) {
            totalCount += entry.getValue().getCount();
        }
        return totalCount;
    }

   /* public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }*/

    public Map<Integer, ShopCarItem> getItems() {
        return items;
    }

    public void setItems(Map<Integer, ShopCarItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShopCar{" +
                "totalPrice=" + getTotalPrice() +
                ", totalCount=" + getTotalCount() +
                ", items=" + items +
                '}';
    }
}
