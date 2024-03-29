package com.hy.mediator.example01;


public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与中介联系
    public void contact(String message){
        mediator.contact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主: " + name +",获取到的信息: " + message);
    }
}
