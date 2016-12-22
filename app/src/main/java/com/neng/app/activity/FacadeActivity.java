package com.neng.app.activity;

import android.view.View;

import com.neng.app.facade.MobilePhone;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/22.
 */
public class FacadeActivity extends BaseActivity {
    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);

        MobilePhone nexus = new MobilePhone();
        //拍照
        nexus.takePicture();
        //视频聊天
        nexus.videoChat();
    }
}
