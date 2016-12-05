package com.neng.app.command;

/**
 * 命令接口
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public interface Command {

    /**
     * 命令方法
     *
     * @return 返回当前Action
     */
    String execute();

}
