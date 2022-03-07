package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Component
 * @Description: 被装饰父类接口
 * @date : 2022/3/7 14:14
 */
public abstract class Tea {

    String description = "";

    public abstract Float getPrice();

    public String getDescription() {
        return description;
    }
}
