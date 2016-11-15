package com.neng.app.activity;

import com.neng.app.stragery.BusStragery;
import com.neng.app.stragery.CalculateStrategy;
import com.neng.app.stragery.SubWayStragery;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/14.
 */
public class StrageryActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

        int km = 20;
        //new 公交对象
        BusStragery mBusstragery = new BusStragery();
        //new 地铁对象
        SubWayStragery mSubstragery = new SubWayStragery();

        int mBusbilling = setBilling(mBusstragery, km);
        int mSubbilling = setBilling(mSubstragery, km);
        setTextStr("计费其中 公交:" + mBusbilling + "   地铁:" + mSubbilling);

    }

    /**
     * 计算算法
     *
     * @param strategy 抽象计算接口
     * @param km       路程km
     * @return 金额
     */
    private int setBilling(CalculateStrategy strategy, int km) {
        return strategy.calculatePrice(km);
    }
}
