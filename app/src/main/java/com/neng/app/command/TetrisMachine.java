package com.neng.app.command;

/**
 * 接收者角色 Action
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class TetrisMachine {

    public String toLeft() {
        return "向左";
    }

    public String toRinght() {
        return "向右";
    }

    public String fallToBottom() {
        return "快速落下";
    }

    public String transform() {
        return "改变形状";
    }
}
