package org.example;

import org.example.interfaceTest.Animal;
import org.example.interfaceTest.Cat;

/**
 * Hello world!
 *
 */
public class App extends Object
{
    public static void main( String[] args )
    {
//        多态测试
//        Shape circle = new Circle();
//        Shape rectangle = new Rectangle();
//        circle.draw();
//        rectangle.draw();
//        object作为多态类型测试
//        Shape test = (Shape) getObject(circle);
//        test.draw();
//        instanceof测试接口
//        Shape test = new RectCicle();
//        System.out.println(test instanceof RectCicle);
//        System.out.println(test instanceof Circle);
//        System.out.println(test instanceof Shape);
//        instance测试类
//        AbstactAnimal cat = new Cat();
//        System.out.println(cat instanceof Cat);
//        System.out.println(cat instanceof Animal);
//        System.out.println(cat instanceof AbstactAnimal);
        Animal cat = new Cat();
        cat.test();
    }

    private static Object getObject(Object o) {
        return o;
    }
}
