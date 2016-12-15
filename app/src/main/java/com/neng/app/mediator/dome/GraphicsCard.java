package com.neng.app.mediator.dome;

import android.util.Log;

/**
 * 显卡
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videopPlay(String data) {
        Log.d(getClass().getSimpleName(), "显卡视频播放：" + data);
    }
}
