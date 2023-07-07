package com.hy.visitor.example01;

import java.time.LocalDate;


public class Candy extends Product implements Acceptable{

    public Candy(String name, LocalDate produceDate, double price) {
        super(name, produceDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        //在accept方法中调用访问者, 并将自己 this 传递回去.
        visitor.visit(this);
    }
}
