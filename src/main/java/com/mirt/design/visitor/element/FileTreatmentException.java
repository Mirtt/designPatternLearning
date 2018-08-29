package com.mirt.design.visitor.element;

/**
 * 对文件调用add方法抛出的异常类
 *
 * @author Mirt Zhang
 * @date 2018/8/6
 */
public class FileTreatmentException extends Exception {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
