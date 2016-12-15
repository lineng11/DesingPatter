package com.neng.app.activity;

import android.view.View;

import com.neng.app.mediator.dome.BoardMediator;
import com.neng.app.mediator.dome.CDDevice;
import com.neng.app.mediator.dome.CPU;
import com.neng.app.mediator.dome.GraphicsCard;
import com.neng.app.mediator.dome.SoundCard;

/**
 * 中介模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class MediatorActivity extends BaseActivity {
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
        //构造中介对象
        BoardMediator mediator = new BoardMediator();

        //构造具体同事，
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        mediator.setCpu(cpu);
        mediator.setCdDevice(cdDevice);
        mediator.setGraphicsCard(graphicsCard);
        mediator.setSoundCard(soundCard);

        //中介去完成Action
        cdDevice.setData("视频数据,音频数据");
        mediator.changed(cdDevice);

    }
}
