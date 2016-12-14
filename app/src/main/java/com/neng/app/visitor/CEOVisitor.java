package com.neng.app.visitor;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public class CEOVisitor implements Visitor {

    private String TAG = this.getClass().getSimpleName();

    @Override
    public void visit(Engineer engineer) {
        Log.d(TAG, "工程师 :" + engineer.name + "   KPI：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        Log.d(TAG, "经理 :" + manager.name + "   KPI：" + manager.kpi);
    }
}
