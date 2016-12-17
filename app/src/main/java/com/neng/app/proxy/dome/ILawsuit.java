package com.neng.app.proxy.dome;

/**
 * 抽象诉讼业务
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public interface ILawsuit {

    /**
     * 提交申请
     */
    void submit();

    /**
     * 进行举证
     */
    void burden();

    /**
     * 开始辩论
     */
    void defend();

    /**
     * 诉讼完成
     */
    void finish();
}
