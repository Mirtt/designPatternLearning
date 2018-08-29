package com.mirt.design.adapter.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 作为 FileIO 与 java.util.Properties 之间的适配器
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class FileProperties extends Properties implements FileIO {

    private String path;

    private String comments = "Comments for file properties";

    public FileProperties(String path) {
        this.path = path;
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        File file = new File(path + fileName);
        FileInputStream fis = new FileInputStream(file);
        load(fis);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        File file = new File(path + fileName);
        FileOutputStream fos = new FileOutputStream(file);
        store(fos, comments);
        fos.close();
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
