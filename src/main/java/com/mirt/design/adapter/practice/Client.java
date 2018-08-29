package com.mirt.design.adapter.practice;

import java.io.IOException;

/**
 * 客户端调用，读取file.txt文件 然后 设置新的属性到 newFile文件
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class Client {
    public static void main(String[] args) {
        FileIO f = new FileProperties("E:\\workspace\\DesignPatternLearning\\src\\main\\java\\com\\mirt\\design\\adapter\\practice1\\");
        try {
            f.readFromFile("file.txt");
            f.setValue("xxx", "111");
            f.setValue("yyy", "222");
            f.setValue("zzz", "333");
            f.setValue("year", "2018");
            f.writeToFile("newFile.txt");
        } catch (IOException e) {
            System.out.println("error!!!" + e.getMessage());
        }
    }
}
