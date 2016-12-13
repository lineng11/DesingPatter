package com.neng.app.template;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class MilltaryComouter extends AbstractComputer {

    @Override
    protected void checkHardware() {
        super.checkHardware();
        Log.e(TAG, "硬件防火墙检查");
    }

    @Override
    protected void login() {
        Log.e(TAG, "指纹识别进行登录验证登录");
    }
}
