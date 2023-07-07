package com.hy.memento.example;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    private static boolean nextStep = false;

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //创建玩家类,设置初始金币
        Player player = new Player(100);

        //创建备忘录对象
        Memento memento = player.createMemento();

        for (;;) {
            //显示当前玩家状态
            System.out.println("当前状态: " + player);
            scanner.next();
            int dice = random.nextInt(6) + 1; //掷骰子
            //开启游戏
            player.yacht(dice);
            System.out.println("玩完本轮游戏后玩家所持有的金币: " + player.getMoney() + " 元");

            //复活操作
            if(player.getMoney() > memento.getMoney()){
                System.out.println("赚到金币,保存当前状态,继续游戏!");
                memento = player.createMemento();  //更新快照
            }else if(player.getMoney() < memento.getMoney()){
                System.out.println("亏了, 重置到亏钱前的状态!");
                player.restoreMemento(memento);
            }

        }
    }
}
