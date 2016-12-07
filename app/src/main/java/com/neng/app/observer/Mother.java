package com.neng.app.observer;


import java.util.Observable;

/**
 * 母亲 被观察者
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/6.
 */
public class Mother extends Observable {

    public Mother() {
        super();
    }


    /**
     * 做饭
     */
    public void cooking(String contnet) {
        notifyObservers(contnet);
    }


    /**
     * 通知所以
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 通知
     *
     * @param data
     */
    public void notifyObservers(Object data) {
        setChanged();
        if (data == null)
            super.notifyObservers();
        else
            super.notifyObservers(data);

    }
}
