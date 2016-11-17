package com.neng.app.chainRespons;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/17.
 */
public class DirectorLeader extends Leader {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public String handle(int money) {
        return "主管同意批准，"+money;
    }
}
