package com.neng.app.command.concrete;

import com.neng.app.command.Command;
import com.neng.app.command.TetrisMachine;

/**
 * 左 命令实现
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class LeftCommand implements Command {

    private TetrisMachine tetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public String execute() {
        return tetrisMachine.toLeft();
    }
}
