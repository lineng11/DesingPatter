package com.neng.app.facade;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/22.
 */
public class SamsungCamera implements Camera {

    private String TAG = this.getClass().getSimpleName();
    @Override
    public void open() {
        Log.d(TAG, "open: 打开相机");
    }

    @Override
    public void takePicture() {
        Log.d(TAG, "takePicture: 拍照");
    }

    @Override
    public void close() {
        Log.d(TAG, "close: 关闭相机");
    }
}
