package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : RedTeaAddSaltDecorator
 * @Description: 装饰者 加盐
 * @date : 2022/3/7 14:26
 */
public class RedTeaAddSaltDecorator extends TeaDecorator{

    private Tea tea;

    public RedTeaAddSaltDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public Float getPrice() {
        return (tea.getPrice()+5);
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + ",加盐";
    }
}
