package com.microsoft.Exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Application {
    @Test
    public void process_1() {
        int x = 1;
        assert x > 0;
        System.out.println(x);
    }
}


