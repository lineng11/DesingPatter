package com.neng.app.visitor;

import java.util.Random;

/**
 * 员工基类
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public abstract class Staff {

    public String name;
    public int kpi;


    public Staff(String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
