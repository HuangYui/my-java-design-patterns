package com.hy.anotherexample;

import java.util.concurrent.Callable;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : CallableAdapter
 * @Description: callable适配器，让其可以当成runnable使用
 * @date : 2022/3/10 15:29
 */
public class CallableAdapter implements Runnable{

    private Callable callable;

    public CallableAdapter(Callable callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
