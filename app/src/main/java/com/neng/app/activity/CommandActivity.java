package com.neng.app.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.neng.app.R;
import com.neng.app.command.Buttons;
import com.neng.app.command.TetrisMachine;
import com.neng.app.command.concrete.FallCommand;
import com.neng.app.command.concrete.LeftCommand;
import com.neng.app.command.concrete.RightCommand;
import com.neng.app.command.concrete.TransformCommand;

/**
 * 命令模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class CommandActivity extends BaseActivity implements View.OnClickListener {

    private TextView textView;
    private Button buttonLeft, buttonRight, buttonFall, buttonTransform;

    private Buttons buttons;

    @Override
    protected int getContentView() {
        return R.layout.activity_command;
    }

    @Override
    protected void initCreate() {

        textView = (TextView) findViewById(R.id.action_txt);
        buttonLeft = (Button) findViewById(R.id.left_but);
        buttonLeft.setOnClickListener(this);
        buttonRight = (Button) findViewById(R.id.right_but);
        buttonRight.setOnClickListener(this);
        buttonFall = (Button) findViewById(R.id.fall_but);
        buttonFall.setOnClickListener(this);
        buttonTransform = (Button) findViewById(R.id.transform_but);
        buttonTransform.setOnClickListener(this);


        //接收者角色
        TetrisMachine tetrisMachine = new TetrisMachine();

        LeftCommand leftCommand = new LeftCommand(tetrisMachine);
        RightCommand rightCommand = new RightCommand(tetrisMachine);
        FallCommand fallCommand = new FallCommand(tetrisMachine);
        TransformCommand transformCommand = new TransformCommand(tetrisMachine);

        buttons = new Buttons(leftCommand, rightCommand, fallCommand, transformCommand);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_but:
                setTextAction(buttons.toLeft());
                break;
            case R.id.right_but:
                setTextAction(buttons.toRight());
                break;
            case R.id.fall_but:
                setTextAction(buttons.fall());
                break;
            case R.id.transform_but:
                setTextAction(buttons.transform());
                break;
        }
    }

    private void setTextAction(String action) {
        textView.setText(action);
    }
}
