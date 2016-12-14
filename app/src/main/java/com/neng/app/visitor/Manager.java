package com.neng.app.visitor;

import java.util.Random;

/**
 * 经理
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 产品一年做的产品数目
     *
     * @return
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }

}
