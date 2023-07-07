package com.hy.state.example01;


/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Test
 * @Description:
 * @date : 2023/7/7 22:40
 */
public class Test {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
    }
}
