package com.mirt.design.chain;

/**
 * 用于解决问题的抽象类，责任链上的对象
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public abstract class Support {
    // 解决问题的实例的名字
    private String name;
    // 问题未能解决，需要推卸给的下一个对象
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    /**
     * 需要由各个责任链的节点实现该方法，用于判断能否解决该问题
     *
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
