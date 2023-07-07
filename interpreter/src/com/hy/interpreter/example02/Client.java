package com.hy.interpreter.example02;


public class Client {

    public static void main(String[] args) {

        ExpressionInterpreter e = new ExpressionInterpreter();
        long result = e.interpret("6 8 3 2 4 + - + *");
        System.out.println(result);
    }
}
