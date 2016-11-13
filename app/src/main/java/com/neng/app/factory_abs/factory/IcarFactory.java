package com.neng.app.factory_abs.factory;

/**
 * 车厂的组成 接口
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public interface IcarFactory {


    /**
     * 抽象 轮胎
     */
    interface ITire {

        String tire();
    }

    /**
     * 抽象 发动机
     */
    interface IEngine {

        String engine();
    }

    /**
     * 抽象 制动系统
     */
    interface IBrake {

        String brake();
    }

}
