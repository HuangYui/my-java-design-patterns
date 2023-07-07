package com.hy.state.example02;


public class Client {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
    }
}
