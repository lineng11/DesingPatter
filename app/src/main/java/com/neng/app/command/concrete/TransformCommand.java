package com.neng.app.command.concrete;

import com.neng.app.command.Command;
import com.neng.app.command.TetrisMachine;

/**
 * 变 命令实现
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class TransformCommand implements Command {

    private TetrisMachine tetrisMachine;

    public TransformCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public String execute() {
        return tetrisMachine.transform();
    }
}
