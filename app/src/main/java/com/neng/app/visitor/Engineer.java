package com.neng.app.visitor;

import java.util.Random;

/**
 * 工程师
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 工程师一年写的代码数量
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
