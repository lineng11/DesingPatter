package com.neng.app.iterator.code;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class HuiIteratot implements Iterator {

    private Employee[] array;
    private int position;

    public HuiIteratot(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > (array.length - 1) || null == array[position]);
    }

    @Override
    public Object next() {
        Employee employee = array[position++];
        return employee;
    }
}
