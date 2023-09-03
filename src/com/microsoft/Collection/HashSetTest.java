package com.microsoft.Collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    @Test
    public void hashSetTest(){
        HashSet<String> stringHashSet = new HashSet<>();

        // 1.Set中元素不能重复
        stringHashSet.add("Jack");
        stringHashSet.add("Jack");
        System.out.println(stringHashSet.size());

        // 2.Set中的元素，没有顺序。
        // 严格的说，是没有按照元素的插入顺序排列
        HashSet<Integer> integerHashSet = new HashSet<>();

        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(4);
        System.out.println(integerHashSet);
    }

    @Test
    public void traverseHashSet(){
        /*
        Set不提供get()来获取指定位置的元素
        所以遍历需要用到迭代器，或者增强型for循环
         */
        HashSet<Integer>integerHashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            integerHashSet.add(i);
        }

        // 遍历Set可以采用迭代器iterator
        Iterator<Integer> integerIterator = integerHashSet.iterator();
        while(integerIterator.hasNext()){
            Integer integer = integerIterator.next();
            System.out.println(integer);
        }

        // 增强for循环
        for (Integer i :
                integerHashSet) {
            System.out.println(i);
        }
    }
}
