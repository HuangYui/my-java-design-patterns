package com.hy.anotherexample;

import java.util.concurrent.Callable;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Task
 * @Description:
 * @date : 2022/3/10 15:34
 */
public class Task<T> implements Callable {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public T call() throws Exception {
        System.out.println("call执行了");
        return null;
    }
}
