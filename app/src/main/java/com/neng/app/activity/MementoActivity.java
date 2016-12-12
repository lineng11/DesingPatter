package com.neng.app.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.neng.app.R;
import com.neng.app.menento.Caretaker;
import com.neng.app.menento.Originator;

/**
 * 备忘录模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/12.
 */
public class MementoActivity extends BaseActivity implements View.OnClickListener {

    private TextView action_txt;
    private Button starBut, playGamesBut, endBut, againStarBut;

    //游戏
    private Originator mOriginator;
    //管理录
    private Caretaker caretaker;

    @Override
    protected int getContentView() {
        return R.layout.activity_memento;
    }

    @Override
    protected void initCreate() {
        action_txt = (TextView) findViewById(R.id.action_txt);
        starBut = (Button) findViewById(R.id.starBut);
        playGamesBut = (Button) findViewById(R.id.playGamesBut);
        endBut = (Button) findViewById(R.id.endBut);
        againStarBut = (Button) findViewById(R.id.againStarBut);

        starBut.setOnClickListener(this);
        playGamesBut.setOnClickListener(this);
        endBut.setOnClickListener(this);
        againStarBut.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.starBut:
                //初始化游戏对象
                mOriginator = new Originator();
                action_txt.setText("启动： " + mOriginator.toString());
                break;
            case R.id.playGamesBut:
                mOriginator.play("倚天宝刀");
                action_txt.setText("玩游戏 当前状态: " + mOriginator.toString());
                break;
            case R.id.endBut:
                //退出
                caretaker = mOriginator.quit(mOriginator.createMemoto());
                action_txt.setText("退出游戏/并且已存档");

                break;
            case R.id.againStarBut:
                Originator newOriginator = new Originator();
                newOriginator.restore(caretaker.getMenoto());
                action_txt.setText("读档启动：" + newOriginator.toString());
                break;
        }
    }
}
