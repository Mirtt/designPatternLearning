package com.mirt.design.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用DataBase和HtmlWriter来生成指定用户的web界面
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String userName = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("welcome to " + userName + "'s page");
            writer.paragraph(userName + " welcome to " + userName + "'s page");
            writer.paragraph("waiting for your email");
            writer.mailto(mailAddr, userName);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + userName + ")");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
