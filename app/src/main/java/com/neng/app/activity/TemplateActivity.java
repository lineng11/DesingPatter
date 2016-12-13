package com.neng.app.activity;

import android.view.View;
import android.widget.Button;

import com.neng.app.R;
import com.neng.app.template.AbstractComputer;
import com.neng.app.template.CodeComouter;
import com.neng.app.template.MilltaryComouter;

/**
 * 模版模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class TemplateActivity extends BaseActivity implements View.OnClickListener {


    private Button starBut1, starBut2;

    private AbstractComputer comp;

    @Override
    protected int getContentView() {
        return R.layout.activity_template;
    }

    @Override
    protected void initCreate() {
        starBut1 = (Button) findViewById(R.id.starBut1);
        starBut2 = (Button) findViewById(R.id.starBut2);
        starBut1.setOnClickListener(this);
        starBut2.setOnClickListener(this);

        //普通小白启动计算机
        comp = new AbstractComputer() {
            @Override
            protected void login() {
                super.login();
            }
        };
        comp.starUp();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.starBut1:
                comp = new CodeComouter();
                comp.starUp();
                break;

            case R.id.starBut2:
                comp = new MilltaryComouter();
                comp.starUp();
                break;
        }
    }
}
