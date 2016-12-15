package com.neng.app.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 员工数据表
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/14.
 */
public class BusinessReport {

    List<Staff> mStaff = new LinkedList<>();

    public BusinessReport() {
        mStaff.add(new Manager("Wang经理"));
        mStaff.add(new Engineer("工程师--Shawn.Xiong"));
        mStaff.add(new Engineer("工程师--Keal"));
        mStaff.add(new Engineer("工程师--Chaossss"));
        mStaff.add(new Engineer("工程师--Leene"));
    }


    /**
     * 为访问者展示报表
     *
     * @param visitor
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaff) {
            staff.accept(visitor);
        }
    }
}
