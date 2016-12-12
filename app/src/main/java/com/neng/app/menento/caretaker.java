package com.neng.app.menento;

/**
 * 负责 管理备忘录
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/12.
 */
public class Caretaker {

    //一定对备忘录内部状态操作，所以注意修饰符
    private Menoto menoto; //备忘录

    /**
     * 存档
     *
     * @param menoto
     */
    public void archive(Menoto menoto) {
        this.menoto = menoto;
    }

    /**
     * 获取存档
     *
     * @return
     */
    public Menoto getMenoto() {
        return menoto;
    }
}
