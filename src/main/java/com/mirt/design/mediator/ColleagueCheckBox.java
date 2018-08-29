package com.mirt.design.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * checkbox组件
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class ColleagueCheckBox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckBox(String label, CheckboxGroup group, boolean state) {
        super(label, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
