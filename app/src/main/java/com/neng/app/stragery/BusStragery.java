package com.neng.app.stragery;

/**
 * 计算公交车的策略
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/14.
 */
public class BusStragery implements CalculateStrategy {


    /**
     * 公交车是 10km之内是1元 然后超过5km加1元
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraFactor % 5;
        int price = 1 + extraFactor * 1;

        return fraction > 0 ? ++price : price;
    }
}
