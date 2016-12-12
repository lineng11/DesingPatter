package com.neng.app.activity;

import android.util.Log;
import android.view.View;

import com.neng.app.iterator.code.Employee;
import com.neng.app.iterator.code.HuiIteratot;
import com.neng.app.iterator.code.Iterator;
import com.neng.app.iterator.code.MinIteratot;
import com.neng.app.iterator.model.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class IteratorActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {
        //迭代器
        new Client().main();


    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);

        Employee[] array = Hui();
        List<Employee> list = Min();
        //迭代不同集合的人员
        check("Hui", new HuiIteratot(array));
        check("Min", new MinIteratot(list));

    }

    private void check(String xxx, Iterator iterator) {
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            Log.d(xxx + " 统计人员：", employee.toString());
        }
    }


    public Employee[] Hui() {
        Employee[] array = new Employee[5];
        array[0] = new Employee("孙悟空", 88, "男", "开发");
        array[1] = new Employee("狐狸", 18, "女", "测试");
        array[2] = new Employee("大师", 30, "男", "后台");
        array[3] = new Employee("琴女", 22, "女", "UI");
        array[4] = new Employee("皇子", 33, "男", "开发");
        return array;
    }

    public List<Employee> Min() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("孙悟空", 88, "男", "开发"));
        list.add(new Employee("狐狸", 18, "女", "测试"));
        list.add(new Employee("大师", 30, "男", "后台"));
        list.add(new Employee("琴女", 22, "女", "UI"));
        list.add(new Employee("皇子", 33, "男", "开发"));
        return list;
    }
}
