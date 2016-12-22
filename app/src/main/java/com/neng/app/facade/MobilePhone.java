package com.neng.app.facade;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/22.
 */
public class MobilePhone {

    private Phone phone = new PhoneImpl();
    private Camera camera = new SamsungCamera();

    public void dail() {
        phone.dail();
    }


    public void videoChat() {
        camera.open();
        phone.dail();
    }

    public void hangup() {
        phone.hangup();
    }

    public void takePicture() {
        camera.open();
        camera.takePicture();
    }

    public void closeCamera() {
        camera.close();
    }
}

