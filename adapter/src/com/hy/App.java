package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : App
 * @Description: 测试
 * @date : 2022/3/10 15:19
 */
public class App {

    public static void main(String[] args) {
        //首先，有一个只会划船的船长
        Captain captain = new Captain(()->{
            System.out.println("船长划船移动");
        });
        captain.move();
        //这时候，海盗来了，假设手上只有一艘渔船，我们需要用适配器，让渔船也可以划动
        captain = new Captain(new FishingBoatAdapter());
        captain.move();

    }
}
