package com.hy.visitor.example01;


public interface Acceptable {

    //接收所有的Visitor访问者的子类
    public void accept(Visitor visitor);
}
