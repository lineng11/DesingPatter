package com.neng.app.adapter;

/**
 * 适配器
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/19.
 */
public class VoltAdapter implements FiveVolt {

    private Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    /**
     * 220V 电压
     *
     * @return
     */
    public int getVolt220() {
        return volt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return getVolt220() - 215;
    }
}
