package com.neng.app.command.concrete;

import com.neng.app.command.Command;
import com.neng.app.command.TetrisMachine;

/**
 * 右 命令实现
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class RightCommand implements Command {
    private TetrisMachine tetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public String execute() {
        return tetrisMachine.toRinght();
    }
}
