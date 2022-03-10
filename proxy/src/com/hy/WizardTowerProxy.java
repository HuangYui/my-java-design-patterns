package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : WizardTowerProxy
 * @Description:
 * @date : 2022/3/10 16:33
 */
public class WizardTowerProxy implements WizardTower{

    private final WizardTower wizardTower;

    private int count;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    /**
     * 进入塔
     *
     * @param wizard
     */
    @Override
    public void enter(Wizard wizard) {
        if (++count > 3) {
            System.out.println("已经有3个巫师进入了塔中");
            return;
        }
        wizardTower.enter(wizard);
    }
}
