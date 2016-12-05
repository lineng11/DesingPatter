package com.neng.app.command.concrete;

import com.neng.app.command.Command;
import com.neng.app.command.TetrisMachine;

/**
 * 落 命令实现
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class FallCommand implements Command {

    private TetrisMachine tetrisMachine;

    public FallCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public String execute() {
        return tetrisMachine.fallToBottom();
    }
}
