package com.mirt.design.state;

/**
 * 负责管理状态和联系报警中心的上下文
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public interface Context {
    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
