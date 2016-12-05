package com.neng.app.command;

import com.neng.app.command.concrete.FallCommand;
import com.neng.app.command.concrete.LeftCommand;
import com.neng.app.command.concrete.RightCommand;
import com.neng.app.command.concrete.TransformCommand;

/**
 * 请求者
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class Buttons {

    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransformCommand transformCommand;

    public Buttons() {
    }

    public Buttons(LeftCommand leftCommand, RightCommand rightCommand, FallCommand fallCommand, TransformCommand transformCommand) {
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
        this.fallCommand = fallCommand;
        this.transformCommand = transformCommand;
    }

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    /**
     * 按下按钮 左
     *
     * @return
     */
    public String toLeft() {
        return leftCommand.execute();
    }


    /**
     * 按下按钮 右
     *
     * @return
     */
    public String toRight() {
        return rightCommand.execute();
    }

    /**
     * 按下 快速下落
     *
     * @return
     */
    public String fall() {
        return fallCommand.execute();
    }


    /**
     * 按下改变状态 变形
     *
     * @return
     */
    public String transform() {
        return transformCommand.execute();
    }

}
