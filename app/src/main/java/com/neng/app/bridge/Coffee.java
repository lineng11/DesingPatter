package com.neng.app.bridge;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/24.
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体是什么样子，由子类决定
     */
    public abstract void makeCoffee();
}
