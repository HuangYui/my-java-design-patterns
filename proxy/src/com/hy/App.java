package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : App
 * @Description: 场景：巫师塔只能允许前三个巫师进入 而塔本身没有限制进入的能力，在不改变原有代码的前提下，我们可以使用代理模式进行控制
 * @date : 2022/3/10 16:36
 */
public class App {

    public static void main(String[] args) {

        WizardTowerProxy wizardTowerProxy = new WizardTowerProxy(new IvoryTower());
        wizardTowerProxy.enter(new Wizard("a"));
        wizardTowerProxy.enter(new Wizard("b"));
        wizardTowerProxy.enter(new Wizard("c"));
        wizardTowerProxy.enter(new Wizard("d"));
        wizardTowerProxy.enter(new Wizard("e"));

    }
}
