package com.neng.app.state;

/**
 * 电视的操作函数
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/15.
 */
public interface TvState {

    /**
     * 下一个频道
     */
    void nextChannel();

    /**
     * 上一个频道
     */
    void prevChannel();

    /**
     * +++音量
     */
    void turnUp();

    /**
     * ---音量
     */
    void turnDown();
}
