package com.hy.memento.example;

import java.util.ArrayList;
import java.util.List;


class Memento {

    private int money;  //玩家获取的金币

    ArrayList fruits;  //玩家获取的水果

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    //获取当前玩家的金币
    public int getMoney(){
        return money;
    }

    //获取当前玩家的水果
    List getFruits(){
        return (List) fruits.clone();
    }

    //添加水果
    void addFruit(String fruit){
        fruits.add(fruit);
    }

}
