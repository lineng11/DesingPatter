package com.neng.app.visitor;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public interface Visitor {

    /**
     * 访问工程师类型
     *
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     *
     * @param manager
     */
    void visit(Manager manager);
}
