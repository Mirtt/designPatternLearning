package com.mirt.design.mediator;

import java.awt.*;

/**
 * 按钮组件，实现了Colleague接口，与mediator共同工作
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }
}
