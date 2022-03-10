package com.hy.anotherexample;

import java.util.concurrent.Callable;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : App
 * @Description: 测试
 * @date : 2022/3/10 15:31
 */
public class App {

    public static void main(String[] args) {
        //我要新建一个线程，但是只能传runable,这时候就可以用适配器使其适配
        Callable<Long> longTask = new Task<>();
        Thread thread = new Thread(new CallableAdapter(longTask));
        thread.start();
    }
}
