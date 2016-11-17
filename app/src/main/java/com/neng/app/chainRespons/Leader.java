package com.neng.app.chainRespons;

/**
 * 抽象领导
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/17.
 */
public abstract class Leader {

    private Leader nextHander;  //上一级的处理者

    /**
     * 处理报销请求
     *
     * @param money
     */
    public final String handleRequest(int money) {
        String str = "";
        if (money <= limit()) {
            str = handle(money);
        } else {
            if (null != nextHander) {
                str = nextHander.handleRequest(money);
            }

        }
        return str;
    }


    /**
     * 自身批准金额权限
     *
     * @return
     */
    public abstract int limit();

    /**
     * 处理报销行为
     *
     * @param money
     */
    public abstract String handle(int money);


    public void setNextHander(Leader nextHander) {
        this.nextHander = nextHander;
    }
}
