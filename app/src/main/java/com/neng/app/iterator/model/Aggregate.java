package com.neng.app.iterator.model;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public interface Aggregate<T> {

    /**
     * add obj、
     *
     * @param obj
     */
    void add(T obj);

    /**
     * remove obj
     *
     * @param obj
     */
    void remove(T obj);


    /**
     * 获取容器的 迭代器
     *
     * @return
     */
    Iterator<T> iterator();
}
