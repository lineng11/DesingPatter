package com.neng.app.interpreter;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Entity entity) {
        return entity.getNumo() + entity.getNumt();
    }
}
