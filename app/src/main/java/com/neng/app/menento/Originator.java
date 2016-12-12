package com.neng.app.menento;

import android.text.TextUtils;

/**
 * 创建 备忘录
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/12.
 */
public class Originator {


    private int mCheckpoint = 1;  //当前关卡
    private int mLifeValue = 100;  // 生命值
    private String mWeapon = "沙漠小刀";  //武器

    /**
     * 玩游戏
     */
    public void play() {
        play(null);
    }

    /**
     * 玩游戏
     *
     * @param mWeapon 武器
     */
    public void play(String mWeapon) {
        if (!TextUtils.isEmpty(mWeapon))
            this.mWeapon = mWeapon;
        mLifeValue -= 10;
        mCheckpoint++;
    }


    /**
     * 退出游戏
     */
    public Caretaker quit(Menoto menoto) {
        //游戏存档
      Caretaker  caretaker = new Caretaker();
        caretaker.archive(menoto);

        return caretaker;
    }

    /**
     * 创建 备忘录
     *
     * @return
     */
    public Menoto createMemoto() {
        Menoto menoto = new Menoto();
        menoto.setmCheckpoint(mCheckpoint);
        menoto.setmLifeValue(mLifeValue);
        menoto.setmWeapon(mWeapon);
        return menoto;
    }


    /**
     * 恢复游戏属性
     *
     * @param menoto
     */
    public void restore(Menoto menoto) {
        this.mCheckpoint = menoto.getmCheckpoint();
        this.mLifeValue = menoto.getmLifeValue();
        this.mWeapon = menoto.getmWeapon();
    }


    @Override
    public String toString() {
        return "CallofDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
