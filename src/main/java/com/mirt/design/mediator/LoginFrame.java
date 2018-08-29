package com.mirt.design.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 仲裁者的具体实现
 * <p>
 * 实现的功能：
 * 1.设置背景色
 * 2.设置布局管理器
 * 3.调用createColleague生成组件
 * 4.配置colleague组件
 * 5.设置初始状态
 * 6.显示
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckBox checkGuest;
    private ColleagueCheckBox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 4*2 窗格
        setLayout(new GridLayout(4, 2));
        // 生成各个组件
        createColleagues();
        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("username: "));
        add(textUser);
        add(new Label("password: "));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        // 设置初始 启用状态
        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckBox("Guest", g, true);
        checkLogin = new ColleagueCheckBox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        buttonOk = new ColleagueButton("ok");
        buttonCancel = new ColleagueButton("cancel");
        // 设置mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnable(false);
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(true);
        } else {
            textUser.setColleagueEnable(true);
            userpassChanged();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    private void userpassChanged() {
        if (!textUser.getText().isEmpty()) {
            textPass.setColleagueEnable(true);
            buttonOk.setColleagueEnable(textPass.getText().length() > 0);
        } else {
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(false);
        }
    }
}
