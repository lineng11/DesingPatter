package com.neng.app.iterator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list = new ArrayList<>();


    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
