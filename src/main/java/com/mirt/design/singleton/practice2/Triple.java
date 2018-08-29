package com.mirt.design.singleton.practice2;

/**
 * 编写triple类，实现最多3个实例，编号分别为0，1，2
 * 通过 getInstance(int id)来获取对应的实例
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class Triple {

    private int id;

    private Triple(int id) {
        this.id = id;
    }

    public Triple getInstance(int id) {
        switch (id) {
            case 0:
                return TripleHolder.INSTANCE_ZERO;
            case 1:
                return TripleHolder.INSTANCE_ONE;
            case 2:
                return TripleHolder.INSTANCE_TWO;
            default:
                throw new IllegalArgumentException("不合法的id");
        }
    }

    private static class TripleHolder {
        private final static Triple INSTANCE_ZERO = new Triple(0);
        private final static Triple INSTANCE_ONE = new Triple(1);
        private final static Triple INSTANCE_TWO = new Triple(2);
    }

}
