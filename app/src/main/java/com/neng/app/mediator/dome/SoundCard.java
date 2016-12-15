package com.neng.app.mediator.dome;

import android.util.Log;

/**
 * 声卡
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class SoundCard extends Colleague {


    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        Log.d(getClass().getSimpleName(), "声卡音频播放：" + data);
    }
}
