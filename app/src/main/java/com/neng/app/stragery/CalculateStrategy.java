package com.neng.app.stragery;

/**
 * 计算接口
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/14.
 */
public interface CalculateStrategy {

    /**
     * 按照距离计算价格
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
