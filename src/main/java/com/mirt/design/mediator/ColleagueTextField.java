package com.mirt.design.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * text field 组件
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
        setBackground(enable ? Color.white : Color.lightGray);
    }

    // 组件文字变化时候通知mediator
    @Override
    public void textValueChanged(TextEvent event) {
        mediator.colleagueChanged();
    }
}
