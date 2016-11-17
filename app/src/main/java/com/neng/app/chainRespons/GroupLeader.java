package com.neng.app.chainRespons;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/17.
 */
public class GroupLeader extends Leader {


    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public String handle(int money) {
        return "组长同意批准，"+money;
    }

}
