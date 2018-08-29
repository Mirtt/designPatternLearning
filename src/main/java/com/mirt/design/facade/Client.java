package com.mirt.design.facade;

import com.mirt.design.facade.pagemaker.PageMaker;

/**
 * 客户端，调用facade模式的方法
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class Client {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("tomura@hyuki.com", "welcome.html");
    }
}

