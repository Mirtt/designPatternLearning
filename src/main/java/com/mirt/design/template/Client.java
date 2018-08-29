package com.mirt.design.template;

/**
 * 客户端 用于调用不同的模版打印文字和字符
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class Client {

    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('M');
        AbstractDisplay stringDisplay = new StringDisplay("Mirt");
        AbstractDisplay chineseDisplay = new StringDisplay("中文");

        charDisplay.display();
        stringDisplay.display();
        chineseDisplay.display();
    }
}
