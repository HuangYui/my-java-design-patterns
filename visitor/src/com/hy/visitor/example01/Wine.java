package com.hy.visitor.example01;

import java.time.LocalDate;


public class Wine extends Product implements Acceptable{

    public Wine(String name, LocalDate produceDate, double price) {
        super(name, produceDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
