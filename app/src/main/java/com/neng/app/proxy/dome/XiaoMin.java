package com.neng.app.proxy.dome;

import android.util.Log;

/**
 * 诉讼人
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class XiaoMin implements ILawsuit {

    private String TAG = this.getClass().getSimpleName();
    @Override
    public void submit() {
        Log.d(TAG, "submit: 公司Boos拖欠薪资，提出申请仲裁");
    }

    @Override
    public void burden() {
        Log.d(TAG, "burden: 合同证明，过去薪资流水记录清单");
    }

    @Override
    public void defend() {
        Log.d(TAG, "defend: 证据充足");
    }

    @Override
    public void finish() {
        Log.d(TAG, "finish: XiaoMIn诉讼成功，判7个工作日还清薪资+补偿");
    }
}
