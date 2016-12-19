package com.neng.app.activity;

import android.view.View;

import com.neng.app.adapter.Volt220;
import com.neng.app.adapter.VoltAdapter;

/**
 * 适配器模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/19.
 */
public class AdapterActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);

        Volt220 volt220 = new Volt220();
        VoltAdapter adapter = new VoltAdapter(volt220);
        setTextStr("通过适配器得到5V电压: " + adapter.getVolt5());
    }
}
