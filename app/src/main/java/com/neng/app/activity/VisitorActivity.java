package com.neng.app.activity;

import android.util.Log;

import com.neng.app.visitor.BusinessReport;
import com.neng.app.visitor.CEOVisitor;
import com.neng.app.visitor.CTOVisitor;

/**
 * 访问者模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public class VisitorActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {
        //构建报表init
        BusinessReport report = new BusinessReport();

        Log.d(this.getClass().getSimpleName(), "==============给CEO看的报表==============");
        //设置访问者 CEO
        report.showReport(new CEOVisitor());

        Log.d(this.getClass().getSimpleName(), "==============给CTO看的报表==============");
        //设置访问者 CTO
        report.showReport(new CTOVisitor());
    }

}
