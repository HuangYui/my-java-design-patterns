package com.hy.state.example02;


public interface State {

    void switchToGreen(TrafficLight trafficLight);  //切换为绿灯

    void switchToYellow(TrafficLight trafficLight);  //切换为黄灯

    void switchToRed(TrafficLight trafficLight);  //切换为红灯
}
