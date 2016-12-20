package com.neng.app.activity;

import android.util.Log;
import android.view.View;

import com.neng.app.decorator.Boy;
import com.neng.app.decorator.CheapCloth;
import com.neng.app.decorator.ExpensiveCloth;
import com.neng.app.decorator.Person;
import com.neng.app.decorator.PersonCloth;

/**
 * 装饰模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/20.
 */
public class DecoratorActivity extends BaseActivity {

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
        //person男孩
        Person person = new Boy();

        //穿着屌丝衣服
        PersonCloth personCloth = new CheapCloth(person);
        personCloth.dressed();


        Log.d(getClass().getSimpleName(), "onClickButton: ====================================");

        //穿高富帅衣服
        PersonCloth personCloth1 = new ExpensiveCloth(person);
        personCloth1.dressed();

    }
}
