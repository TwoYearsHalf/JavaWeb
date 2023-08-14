package com.microsoft.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) {
        try {
            method_1();
        }catch (Exception exception){
            System.out.println("文件打不开。");
            exception.printStackTrace();
        }

    }

    public static void method_2() throws FileNotFoundException {
        File file = new File("./t.cpp");
        new FileInputStream(file);
    }
    public static void method_1() throws FileNotFoundException{
        method_2();
    }

}
