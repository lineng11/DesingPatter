package com.neng.app.chainRespons;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/17.
 */
public class MansgerLeader extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public String handle(int money) {
        return "经理同意批准，" + money;
    }
}
