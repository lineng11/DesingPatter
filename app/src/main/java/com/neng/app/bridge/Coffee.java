package com.neng.app.bridge;

/**
 * 咖啡
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/24.
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡添加剂
     */
    public abstract void makeCoffee();
}
