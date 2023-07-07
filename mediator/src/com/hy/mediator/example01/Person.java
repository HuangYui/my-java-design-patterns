package com.hy.mediator.example01;


public abstract class Person {

    protected String name;

    //持有中介者的引用
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
