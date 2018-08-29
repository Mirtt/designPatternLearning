package com.mirt.design.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 可以获取指定数据库名所对应的properties实例
 * 这里数据库只是记录了几条数据的文本，并非实际数据库
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(Database.class.getResource("").getPath() + fileName));
        } catch (IOException e) {
            System.out.println("Warning: " + fileName + " is not found.");
        }
        return prop;
    }
}
