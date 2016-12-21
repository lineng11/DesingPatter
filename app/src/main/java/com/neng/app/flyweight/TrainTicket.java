package com.neng.app.flyweight;

import android.util.Log;

import java.util.Random;

/**
 * 具体 享元对象
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/21.
 */
public class TrainTicket implements Ticket {

    //始发地
    public String from;
    //目的地
    public String to;
    //铺位
    public String bunk;
    //价钱
    public int price;


    @Override
    public void showTicketInfo(String from, String to, String bunk) {
        this.from = from;
        this.to = to;
        this.bunk =bunk;
        price = 100;
        switch (bunk) {
            case "硬座":
                price = price * 1;
                break;
            case "下铺":
                price = price * 3;
                break;
            case "上铺":
                price = price * 5;
                break;
            case "商务":
                price = price * 10;
                break;

        }
        price = new Random().nextInt(price);
        Log.d(getClass().getSimpleName(), "showTicketInfo: 购买到从：" + from + " --- " + to + " 的 " + bunk + " 火车票, 价格：" + price);
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBunk() {
        return bunk;
    }

    public void setBunk(String bunk) {
        this.bunk = bunk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", bunk='" + bunk + '\'' +
                ", price=" + price +
                '}';
    }
}
