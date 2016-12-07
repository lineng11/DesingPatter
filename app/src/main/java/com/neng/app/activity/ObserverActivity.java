package com.neng.app.activity;

import android.view.View;
import android.widget.Button;

import com.neng.app.R;
import com.neng.app.observer.Mother;
import com.neng.app.observer.observer.FatherObserver;
import com.neng.app.observer.observer.MyObserver;

/**
 * 观察者模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/6.
 */
public class ObserverActivity extends BaseActivity implements View.OnClickListener {

    private Button fatherButAdd, fatherButDele, myButAdd, myButDele;
    private Button button1, button2, button3, button4;


    private Mother mother;
    private FatherObserver fatherObserver;
    private MyObserver myObserver;

    @Override
    protected int getContentView() {
        return R.layout.activity_observer;
    }

    @Override
    protected void initCreate() {


        fatherButAdd = (Button) findViewById(R.id.fatherButAdd);
        fatherButDele = (Button) findViewById(R.id.fatherButDele);
        myButAdd = (Button) findViewById(R.id.myButAdd);
        myButDele = (Button) findViewById(R.id.myButDele);
        fatherButAdd.setOnClickListener(this);
        fatherButDele.setOnClickListener(this);
        myButAdd.setOnClickListener(this);
        myButDele.setOnClickListener(this);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


        //被观察者角色
        mother = new Mother();

        //观察者
        fatherObserver = new FatherObserver(this);
        myObserver = new MyObserver(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fatherButAdd:
                //添加父亲观察
                mother.addObserver(fatherObserver);
                break;
            case R.id.fatherButDele:
                //移除父亲观察
                mother.deleteObserver(fatherObserver);
                break;
            case R.id.myButAdd:
                //添加我
                mother.addObserver(myObserver);
                break;
            case R.id.myButDele:
                //移出我
                mother.deleteObserver(myObserver);
                break;
            case R.id.button1:
                //菜做好了
                mother.cooking("菜做好了");
                break;
            case R.id.button2:
                //饭煮好了
                mother.cooking("饭煮好了");
                break;
            case R.id.button3:
                //5分钟开发
                mother.cooking("5分钟开发");
                break;
            case R.id.button4:
                //开饭
                mother.cooking("开饭");
                break;
        }
    }
}
