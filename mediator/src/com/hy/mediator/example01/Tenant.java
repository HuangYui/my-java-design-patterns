package com.hy.mediator.example01;


public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message,this);
    }

    public void getMessage(String message){
        System.out.println("租房者"+name+",获取到的信息: " + message);
    }
}
