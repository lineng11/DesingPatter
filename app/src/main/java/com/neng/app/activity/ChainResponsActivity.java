package com.neng.app.activity;

import android.view.View;

import com.neng.app.chainRespons.BossLeader;
import com.neng.app.chainRespons.DirectorLeader;
import com.neng.app.chainRespons.GroupLeader;
import com.neng.app.chainRespons.MansgerLeader;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/17.
 */
public class ChainResponsActivity extends BaseActivity {


    private GroupLeader groupLeader; //组长
    private DirectorLeader directorLeader; //主管
    private MansgerLeader mansgerLeader; //经理
    private BossLeader bossLeader; //Boss

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    public void initCreate() {
        groupLeader = new GroupLeader();
        directorLeader = new DirectorLeader();
        mansgerLeader = new MansgerLeader();
        bossLeader = new BossLeader();

        //设置上级Leader
        groupLeader.setNextHander(directorLeader);
        directorLeader.setNextHander(mansgerLeader);
        mansgerLeader.setNextHander(bossLeader);

    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);
        //不同价格的服务器
        int[] money = new int[]{200, 1885, 8888, 9999, 50000};

        String strMoney = groupLeader.handleRequest(money[3]);
        log(strMoney);
    }
}
