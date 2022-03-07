package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : ReadTeaDecorator
 * @Description: 装饰者 加糖
 * @date : 2022/3/7 14:22
 */
public class RedTeaAddSugarDecorator extends TeaDecorator{

    Tea tea;

    public RedTeaAddSugarDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public Float getPrice() {
        return tea.getPrice() + 5.00F ;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + ",加糖";
    }
}
