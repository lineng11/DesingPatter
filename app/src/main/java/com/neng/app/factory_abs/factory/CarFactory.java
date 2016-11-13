package com.neng.app.factory_abs.factory;

/**
 * 抽象车厂
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public abstract class CarFactory {

    /**
     * 轮胎
     *
     * @return
     */
    public abstract IcarFactory.ITire createTire();

    /**
     * 发动机
     *
     * @return
     */
    public abstract IcarFactory.IEngine createEngine();

    /**
     * 制动系统
     *
     * @return
     */
    public abstract IcarFactory.IBrake createBrake();

}
