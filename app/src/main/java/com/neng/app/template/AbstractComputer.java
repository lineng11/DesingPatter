package com.neng.app.template;

import android.util.Log;

/**
 * 抽象的 Computer
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public abstract class AbstractComputer {

    protected String TAG = this.getClass().getSimpleName();

    public AbstractComputer() {
    }

    protected void powerOn() {
        Log.d(TAG, "开启电脑");
    }

    protected void checkHardware() {
        Log.d(TAG, "检查硬件");
    }

    protected void loadOS() {
        Log.d(TAG, "载入系统OS");
    }

    protected void login() {
        Log.d(TAG, "小白的计算机无验证,直接进入桌面");
    }

    /**
     * 电脑开机模版
     * ** 注意该方法是模版，固定模式，防止篡改 所以要用 final
     */
    public final void starUp() {
        System.out.println("----------开机-----------");
        powerOn();
        checkHardware();
        loadOS();
        login();
    }
}
