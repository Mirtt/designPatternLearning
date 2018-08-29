package com.mirt.design.mediator;

/**
 * 组件接口，需要与mediator通信，由mediator决定组件的行为
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public interface Colleague {
    /**
     * 告知组件应该与哪个mediator 通信
     *
     * @param mediator 仲裁者（中介）
     */
    void setMediator(Mediator mediator);

    /**
     * mediator通知组件结果 是否变为启用状态
     *
     * @param enable 启用状态
     */
    void setColleagueEnable(boolean enable);
}
