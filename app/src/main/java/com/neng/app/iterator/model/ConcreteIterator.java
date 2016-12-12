package com.neng.app.iterator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (null != list && hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
