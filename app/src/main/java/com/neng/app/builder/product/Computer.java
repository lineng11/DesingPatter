package com.neng.app.builder.product;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/5.
 */
public abstract class Computer {

    protected String mName;
    protected String mDisplay;
    protected String mCpu;
    protected String mOS;

    public void setName(String mName) {
        this.mName = mName;
    }

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mName='" + mName + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mCpu='" + mCpu + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
