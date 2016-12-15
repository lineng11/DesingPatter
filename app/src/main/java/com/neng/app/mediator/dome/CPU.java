package com.neng.app.mediator.dome;

/**
 * CPU
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class CPU extends Colleague {

    private String dataVideo, dataSound; //视频和音频

    public CPU(Mediator mediator) {
        super(mediator);
    }


    /**
     * 获取视频数据
     * @return
     */
    public String getDataVideo(){
        return  dataVideo;
    }


    /**
     * 获取音频数据
     * @return
     */
    public String getDataSound(){
        return  dataSound;
    }


    /**
     * 解码视频
     * @param data
     */
    public void decodeData(String data){
        String[] tmp  = data.split(",");
        dataVideo = tmp[0];
        dataSound = tmp[1];

        //告诉中介者自身的状态改变
        mediator.changed(this);
    }

}
