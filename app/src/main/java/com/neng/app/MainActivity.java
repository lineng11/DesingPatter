package com.neng.app;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.neng.app.activity.AdapterActivity;
import com.neng.app.activity.BaseActivity;
import com.neng.app.activity.BuilderActivity;
import com.neng.app.activity.ChainResponsActivity;
import com.neng.app.activity.CommandActivity;
import com.neng.app.activity.CompositeActivity;
import com.neng.app.activity.DecoratorActivity;
import com.neng.app.activity.FactoryAbsActivity;
import com.neng.app.activity.FactoryActivity;
import com.neng.app.activity.InterpreterActivity;
import com.neng.app.activity.IteratorActivity;
import com.neng.app.activity.MediatorActivity;
import com.neng.app.activity.MementoActivity;
import com.neng.app.activity.ObserverActivity;
import com.neng.app.activity.PrototypeActivity;
import com.neng.app.activity.ProxyActivity;
import com.neng.app.activity.SingletonActivity;
import com.neng.app.activity.StateActivity;
import com.neng.app.activity.StrageryActivity;
import com.neng.app.activity.TemplateActivity;
import com.neng.app.activity.VisitorActivity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends BaseActivity {

    private ListView listView;
    private Map<Object, Class> map;
    private Object[] className;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initCreate() {
        listView = (ListView) findViewById(R.id.list_view);
        initDate();
        initListView();
    }

    private void initDate() {
        map = new LinkedHashMap<>();
        map.put("单例模式 Singleton", SingletonActivity.class);
        map.put("建造模式 Builder", BuilderActivity.class);
        map.put("原型模式 Prototype", PrototypeActivity.class);
        map.put("工厂模式 Factory", FactoryActivity.class);
        map.put("抽象工厂模式 Factory", FactoryAbsActivity.class);
        map.put("策略模式 Stragery", StrageryActivity.class);
        map.put("状态模式 State", StateActivity.class);
        map.put("责任链模式 ChainRespons", ChainResponsActivity.class);
        map.put("解释器模式 Interpreter", InterpreterActivity.class);
        map.put("命令模式 Command", CommandActivity.class);
        map.put("观察模式 Observer", ObserverActivity.class);
        map.put("备忘录模式 Memento", MementoActivity.class);
        map.put("迭代器模式 Iterator", IteratorActivity.class);
        map.put("模版模式 Template", TemplateActivity.class);
        map.put("访问者模式 Visitor", VisitorActivity.class);
        map.put("中介模式 Mediator", MediatorActivity.class);
        map.put("代理模式 Proxy", ProxyActivity.class);
        map.put("组合模式 Composite", CompositeActivity.class);
        map.put("适配器模式 Adapter", AdapterActivity.class);
        map.put("装饰模式 Decorator", DecoratorActivity.class);
    }

    private void initListView() {
        Set set = map.keySet();
        className = set.toArray(new Object[]{});
        ArrayAdapter<Object> arrayAdapter = new ArrayAdapter<Object>(
                this, // 当前Activity
                android.R.layout.simple_list_item_activated_1,
                className); // 数据源

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                Class cls = map.get(textView.getText());
                startActivity(new Intent(MainActivity.this, cls).putExtra(TITLE_KEY, textView.getText()));
            }
        });
    }


}
