package com.neng.app.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/21.
 */
public class TicketFactory {


    static Map<String, Ticket> stringTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to, String bunk) {
        Ticket ticket = null;
        String key = from + " - " + to + " - " + bunk;
        //Map是否存在对应的车票信息
        if (stringTicketMap.containsKey(key)) {
            ticket = stringTicketMap.get(key);
        } else {
            ticket = new TrainTicket();
            ticket.showTicketInfo(from, to, bunk);
            stringTicketMap.put(key, ticket);
            return ticket;
        }
        return ticket;
    }

}
