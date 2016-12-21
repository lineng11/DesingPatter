package com.neng.app.flyweight;

/**
 * 享元对象抽象类
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/21.
 */
public interface Ticket {

    /**
     * 车票信息
     *
     * @param from 出发地
     * @param to   终点地
     * @param bunk 座位
     */
    void showTicketInfo(String from, String to, String bunk);
}
