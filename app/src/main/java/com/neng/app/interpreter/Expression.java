package com.neng.app.interpreter;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public interface Expression {

    /**
     * 解释器
     *
     * @param entity 上下文 实体Entity 数据
     * @return
     */
    int interpret(Entity entity);

}
