package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : App
 * @Description: 测试
 * @date : 2022/3/7 14:28
 */
public class App {

    public static void main(String[] args) {
        Tea redTea = new RedTea();
        System.out.println(redTea.getDescription() + "," + redTea.getPrice());
        TeaDecorator teaDecorator = new RedTeaAddSaltDecorator(redTea);
        System.out.println(teaDecorator.getDescription()+":"+teaDecorator.getPrice());
        teaDecorator = new RedTeaAddSugarDecorator(teaDecorator);
        System.out.println(teaDecorator.getDescription()+":"+teaDecorator.getPrice());
    }
}
