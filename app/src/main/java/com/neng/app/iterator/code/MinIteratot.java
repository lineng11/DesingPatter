package com.neng.app.iterator.code;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class MinIteratot implements Iterator {

    private List<Employee> list = new ArrayList<>();
    private int position;

    public MinIteratot(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > (list.size() - 1) || null == list.get(position));
    }

    @Override
    public Object next() {
        Employee employee = list.get(position++);
        return employee;
    }
}
