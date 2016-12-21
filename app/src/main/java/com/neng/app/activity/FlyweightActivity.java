package com.neng.app.activity;

import android.util.Log;
import android.view.View;

import com.neng.app.flyweight.Ticket;
import com.neng.app.flyweight.TicketFactory;

/**
 * 亨元模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/21.
 */
public class FlyweightActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {
        TicketFactory.getTicket("上海", "武汉", "上铺");
        TicketFactory.getTicket("上海", "武汉", "下铺");
        TicketFactory.getTicket("上海", "武汉", "硬座");
        TicketFactory.getTicket("上海", "武汉", "软座");
    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);
        Ticket ticket = TicketFactory.getTicket("上海", "武汉", "上铺");
        Log.e(getClass().getSimpleName(), "onClickButton: " + ticket.toString());
    }
}
