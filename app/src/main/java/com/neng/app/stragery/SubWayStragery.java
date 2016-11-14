package com.neng.app.stragery;

/**
 * 计算地铁费用的策略
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/14.
 */
public class SubWayStragery implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 5;
        int extraFactor = extraTotal / 5;
        int fraction = extraFactor % 5;
        int price = 3 + extraFactor * 1;

        return fraction > 0 ? ++price : price;
    }
}
