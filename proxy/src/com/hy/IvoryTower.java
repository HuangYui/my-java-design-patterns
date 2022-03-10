package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : IvoryTower
 * @Description: 象牙塔
 * @date : 2022/3/10 16:29
 */
public class IvoryTower implements WizardTower {

    /**
     * 进入塔
     *
     * @param wizard
     */
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.getName() + "进来咯");
    }

}
