package com.microsoft.Collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayList {
    /* 静态数组有局限性
       当静态数组被定义好，大小被确定，如果数组没有用完，即造成浪费；如果数据长度过大，则数组放不下

       引入容器类
     */
    // 常见容器类：ArrayList 自动增长，用于存放对象
    @Test
    public void arrayList() {
        // 容器类ArrayList，用于存放对象,
        Animal Cat = new Animal("Cat");

        java.util.ArrayList arrayList = new java.util.ArrayList();

        // 1.add 添加对象
        arrayList.add(new Animal("Dog"));
        arrayList.add(Cat);
        arrayList.add(new Animal("Cat"));

        // 2.indexOf 判断对象的位置，在容器第几个，返回int
//        System.out.println(arrayList.indexOf(Cat));

        // 3.remove 根据元素下标or对象删除
//        arrayList.remove(0);
//        arrayList.remove(Cat);

        // 4.set 替换指定位置的元素
        arrayList.set(2, Cat);
//        System.out.println(arrayList.indexOf(Cat));

        // 5.size 获取容器大小
        arrayList.size();

        // 6.toArray 将ArrayList对象转换为数组，需要指明数组类型，否则默认Object类型数组
        // 返回一个Animal类型的数组
        Animal[] animals = (Animal[]) arrayList.toArray();

        // 7.celear 清空容器
        // arrayList.clear();

    }

    // 泛型，在未指定泛型的容器中，可以向容器中存放任意类型的元素
    // 如果指定了泛型的容器，那么该容器只能存放特定类型的元素及其子类
    @Test
    public void genericsArrayList() {
        // 未指定泛型的容器可以存任何类型元素
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Contry China = new Contry("中国");
        Animal Dog = new Animal("狗");
        arrayList.add(China);
        arrayList.add(Dog);
        // 类型转换失败
        Animal animal = (Animal) arrayList.get(0);
        System.out.println(animal.name);

        // 指定泛型的容器，只能存特地元素及其子类
        // 只能存Animal及其子类
        java.util.ArrayList<Animal> animalArrayList = new java.util.ArrayList<>();

        Contry France = new Contry("法国");
        Animal Cat = new Animal("猫");
        animalArrayList.add(Cat);

        // 无法存入
//        animalArrayList.add(France);

    }

    // Traverse ArrayList 遍历arraylist
    @Test
    public void traverseArrayList() {
        java.util.ArrayList<Animal> animalArrayList = new java.util.ArrayList<>();

        for (int i = 0; i < 5; i++) {
            animalArrayList.add(new Animal("animal name" + i));
        }
        // for循环遍历
        for (int i = 0; i < animalArrayList.size(); i++) {
            Animal animal = animalArrayList.get(i);
            System.out.println(animal.name);
        }
        // Iterator迭代器遍历
        Iterator<Animal> iterator = animalArrayList.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal.name);
        }
        // 迭代器的for写法
        for (Iterator<Animal> animalIterator = animalArrayList.iterator(); iterator.hasNext(); ) {
            Animal animal = animalIterator.next();

        }
    }
}


