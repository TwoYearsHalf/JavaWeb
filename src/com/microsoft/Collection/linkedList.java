package com.microsoft.Collection;

import org.junit.Test;

import java.util.Queue;
import java.util.Stack;

public class linkedList {
    // LinkedList，除了实现List接口，还实现了双向链表结构Deque，头尾都可以插入数据
    @Test
    public void linkedListTest() {
        // linkedList是一个双向链表结构的list
        java.util.LinkedList<Contry> linkedList = new java.util.LinkedList<>();

        // 在最后插入新的元素
        linkedList.add(new Contry("China"));
        linkedList.add(new Contry("Germeny"));
        linkedList.add(new Contry("USA"));
        linkedList.add(new Contry("US"));

        // 在最前面插入新的元素
        linkedList.addFirst(new Contry("Japan"));
        // 查看最前面的元素
        System.out.println(linkedList.getFirst());
        // 查看最后一个元素
        System.out.println(linkedList.getLast());
        // 取出最前面/后的元素
        linkedList.removeFirst();
        linkedList.removeLast();


    }

    // LinkedList 除了实现了List和Deque外，还实现了Queue接口(队列)。
    // Queue是(FIFO)先进先出队列
    @Test
    public void queueTest() {
        Queue<Animal> animalQueue = new java.util.LinkedList<>();
        animalQueue.add(new Animal("哈士奇"));
        animalQueue.add(new Animal("蝮蛇"));
        animalQueue.add(new Animal("猫头鹰"));

        // 取出第一个，符合先进先出原则
        animalQueue.poll();

        // 查看第一个元素
        animalQueue.peek();
    }

    // 栈Stack 与Queue相反，这是先入后出(FILO),类似枪管里面的子弹装填，先进去的最后出来
    @Test
    public void stackTest() {
        Stack<Contry> contryStack = new Stack<>();
        contryStack.add(new Contry("China"));
        contryStack.add(new Contry("US"));
        contryStack.add(new Contry("Japan"));

        // 查看元素
        contryStack.peek();


    }
}
