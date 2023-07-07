package com.hy.command.example01;

import java.util.HashMap;
import java.util.Map;


public class Order {

    private int diningTable;  //餐桌号码

    private Map<String,Integer> foodMenu = new HashMap<>();  //存储菜名和份数

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(Map<String, Integer> foodMenu) {
        this.foodMenu = foodMenu;
    }
}
