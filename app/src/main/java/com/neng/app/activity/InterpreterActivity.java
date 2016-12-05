package com.neng.app.activity;

import android.view.View;

import com.neng.app.interpreter.Entity;
import com.neng.app.interpreter.Minus;
import com.neng.app.interpreter.Plus;

/**
 * 解释器
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class InterpreterActivity extends BaseActivity {


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
        Entity entity = new Entity(2016, 12);
        //+
        int resultPlus = new Plus().interpret(entity);
        Entity entity2 = new Entity(resultPlus, 5);
        //-
        int result = new Minus().interpret(entity2);
        setTextStr(String.valueOf(result));

    }
}
