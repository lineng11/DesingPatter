package com.neng.app.proxy.dome;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class Lawyer implements ILawsuit {


    private XiaoMin xiaoMin;

    public Lawyer(XiaoMin xiaoMin) {
        this.xiaoMin = xiaoMin;
    }

    @Override
    public void submit() {
        xiaoMin.submit();
    }

    @Override
    public void burden() {
        xiaoMin.burden();
    }

    @Override
    public void defend() {
        xiaoMin.defend();
    }

    @Override
    public void finish() {
        xiaoMin.finish();
    }
}
