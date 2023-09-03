package com.microsoft.Collection;

import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void HashMapTest(){
        /*
        对于HashMap而言，key是唯一的，不可以重复的。
        所以，以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。
        不过，同一个对象可以作为值插入到map中，只要对应的key不一样
         */
        // HashMap储存数据的方式是—— 键值对
        Contry ZH= new Contry();
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put((new Contry()).name,"China");
        // 键不能重复，值可以重复
        hashMap.put(new Contry().name,"Japan");
        hashMap.put(ZH.name,"China");
        System.out.println(hashMap.get(new Contry().name));
        System.out.println(hashMap.get(ZH.name));
    }
}
