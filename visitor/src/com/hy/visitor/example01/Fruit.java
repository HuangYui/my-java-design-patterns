package com.hy.visitor.example01;

import java.time.LocalDate;


public class Fruit extends Product implements Acceptable{

    private double weight;  //重量

    public Fruit(String name, LocalDate produceDate, double price, double weight) {
        super(name, produceDate, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
