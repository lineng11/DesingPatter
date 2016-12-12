package com.neng.app.iterator.model;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public interface Iterator<T> {

    /**
     * 是否还有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 光标移动下一个元素
     *
     * @return
     */
    T next();
}
