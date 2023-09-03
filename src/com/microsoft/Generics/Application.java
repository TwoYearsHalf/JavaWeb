package com.microsoft.Generics;

import org.junit.Test;

import java.util.ArrayList;

public class Application {
    /*
    ArrayList默认接受Object类型的对象，因此所有对象都可以存进ArrayList当中
    所以get(0) 返回的类型是Object
    当在一个ArrayList中存入不同类型的元素后，类型转换可能会出现异常
     */
    // 泛型的用法：容器后面添加<Type>，Type可以是类，抽象类，接口
    @Test
    public void generics(){
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        // 只有Animal类可以放进容器
        animalArrayList.add(new Animal());
        // 其他类型元素无法放进去
//        animalArrayList.add(new Contry());

        // 容器的子类可以存放
        animalArrayList.add(new Dog());
    }

}
