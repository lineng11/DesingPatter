package com.neng.app.mediator.dome;

/**
 * 光驱
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class CDDevice extends Colleague {

    private String data; //视频数据

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



}
