package com.microsoft.IO;

import org.junit.Test;

import java.io.*;

public class Run {
    @Test
    /*
    IO是指Input/Output，即输入和输出。以内存为中心：

    Input指从外部读入数据到内存，例如，把文件从磁盘读取到内存，从网络读取数据到内存等等。

    Output指把数据从内存输出到外部，例如，把数据从内存写入到文件，把数据从内存输出到网络等等。

为什么要把数据读到内存才能处理这些数据？因为代码是在内存中运行的，数据也必须读到内存，最终的表示方式无非是byte数组，字符串等，都必须存放在内存里。



    1.byte stream：FileInputStream  /  FileOutputStream ————> 以字节(byte)形式读 写
    2.character stream：FileReader / FileWriter ————> 以字符(char)形式读 写
    3.buffer stream：BufferedRead / BufferedWriter ————> 在已有的流的基础上读 写
     */
    // Byte stream  ——> Memory
    public void byteInputStreamTest() throws IOException {
        // 创建文件
        File file = new File("file/test.txt");
        // 创建字节输入流 ——> 内存中
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        for (int i = 0; i < (int) bytes.length; i++) {

            // 调用read方法，传入参数
            fileInputStream.read(bytes);

            // 以单个字节一个一个搬文件，逐一输出
            System.out.println(bytes[i]);
        }
        // 关闭流
//        fileInputStream.close();
    }

    // String ——> Byte array , Memory ——> demo.txt
    @Test
    public void byteOutputStream() throws IOException {
        String string = "This world need opensource!";
        File file = new File("file/demo.txt");

        // string ——> byte[]
        byte[] bytes = string.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bytes);
        for (int by :
                bytes) {
        }
    }

    // Character stream ——> Memory
    @Test
    public void characterInputStreamTest() throws IOException {
        File file = new File("file/test.txt");
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int) file.length()];

        fileReader.read(chars);

        for (char c :
                chars) {
            System.out.print(c);
        }
    }

    @Test
    public void characterOutputStream() throws IOException {
        String string = "The OpenSource is a grateful things";
        char[] chars = string.toCharArray();
        File file = new File("file/demo.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(chars);
        // 刷新缓冲区！
        fileWriter.flush();
//        fileWriter.flush();
//        for (char ch :
//                chars) {i
//            System.out.println(ch);

//        }
    }

    // 缓存流(字节) BufferedByteInputStream
    @Test
    public void bufferedByteInputStream() throws IOException {
        File file = new File("file/demo.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        byte[] bytes = new byte[(int) file.length()];
        // 一个字节一个字节搬运
        bufferedInputStream.read(bytes);

        bufferedInputStream.close();
        String string = new String(bytes);
        System.out.println(string);
    }

    // 缓存流(字节) BufferedByteOutputStream
    @Test
    public void bufferedByteOutputStream() throws IOException {
        File file = new File("file/demo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String string = "This is a BufferedOutputStream";

        byte[] bytes = string.getBytes();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
    }

    @Test

    public void bufferedReadStream() throws IOException {
        File file = new File("file/demo.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            String string = bufferedReader.readLine();
            if (null == string)
                break;
            System.out.println(string);
        }

    }

//     4k壁纸复制

  

    @Test
    public void copyPhoto() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("file/4K-卡特琳娜.png"));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("file/copy.png"));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        // 创建一个字节数组，并设置数组长度，用于读取需要复制的文件
        byte[] buff = new byte[1024];

        // read方法返回的是int ，意为读入缓冲区的总字节数，如果读完了文件，则返回-1
//        int by;

        while ( bufferedInputStream.read(buff) != -1) {
            bufferedOutputStream.write(buff, 0, buff.length);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }

}
 