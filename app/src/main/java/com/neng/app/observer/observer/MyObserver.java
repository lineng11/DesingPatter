package com.neng.app.observer.observer;

import android.content.Context;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

/**
 * 我 观察者
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/7.
 */
public class MyObserver implements Observer {

    private Context context;
    public MyObserver(Context context) {
        this.context = context;
    }

    @Override
    public void update(Observable observable, Object data) {
        Toast.makeText(context,"被观察者(妈妈) 对我说：" + data,Toast.LENGTH_SHORT).show();
    }
}
