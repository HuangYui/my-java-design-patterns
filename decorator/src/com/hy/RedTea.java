package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : RedTea
 * @Description: 被装饰者
 * @date : 2022/3/7 14:20
 */
public class RedTea extends Tea{


    public RedTea() {
        description = "红茶";
    }

    @Override
    public Float getPrice() {
        return 2.0F;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
