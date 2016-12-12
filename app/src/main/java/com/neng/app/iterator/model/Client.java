package com.neng.app.iterator.model;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class Client {

    public void main() {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("111");
        aggregate.add("222");
        aggregate.add("333");
        aggregate.add("444");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            Log.d("迭代器", next);

        }
    }
}
