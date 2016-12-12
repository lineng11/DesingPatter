package com.neng.app.menento;

/**
 * 备忘录 角色
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/12.
 */
public class Menoto {

    private int mCheckpoint;  //当前关卡
    private int mLifeValue;  // 生命值
    private String mWeapon;  //武器

    public Menoto() {
    }

    public Menoto(int mCheckpoint, int mLifeValue, String mWeapon) {
        this.mCheckpoint = mCheckpoint;
        this.mLifeValue = mLifeValue;
        this.mWeapon = mWeapon;
    }

    public void setmCheckpoint(int mCheckpoint) {
        this.mCheckpoint = mCheckpoint;
    }

    public void setmLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public void setmWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    public int getmCheckpoint() {
        return mCheckpoint;
    }

    public int getmLifeValue() {
        return mLifeValue;
    }

    public String getmWeapon() {
        return mWeapon;
    }

    @Override
    public String toString() {
        return "Menoto{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
