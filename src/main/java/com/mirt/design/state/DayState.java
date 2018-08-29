package com.mirt.design.state;

/**
 * 具体的状态实现类，白天的状态
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class DayState implements State {

    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17)
            context.changeState(NightState.getInstance());
    }

    @Override
    public void doUser(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    @Override
    public String toString() {
        return "【白天】";
    }
}
