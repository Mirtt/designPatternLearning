package com.mirt.design.state;

/**
 * 表示不同的状态应该实现的方法
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public interface State {
    // 设置时间 context用来管理状态
    void doClock(Context context, int hour);

    void doUser(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
