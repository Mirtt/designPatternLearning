package com.mirt.design.adapter.practice;

import java.io.IOException;

/**
 * 业务方需要实现的功能接口方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public interface FileIO {

    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);

}
