package com.neng.app.chainRespons;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/17.
 */
public class BossLeader extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String handle(int money) {
        return "Boos同意批准，" + money;
    }
}
