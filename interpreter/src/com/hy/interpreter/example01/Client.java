package com.hy.interpreter.example01;


public class Client {

    public static void main(String[] args) {

        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        long result = interpreter.interpret("6 8 3 2 4 + - + *");
        System.out.println("6 8 3 2 4 + - + * 表达式的结果为: "+result);
    }
}
