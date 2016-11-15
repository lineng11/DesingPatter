package com.neng.app.activity;

import com.neng.app.factory_abs.factory.CarFactory;
import com.neng.app.factory_abs.product.Q3Factory;
import com.neng.app.factory_abs.product.Q7Factory;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class FactoryAbsActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

        CarFactory Q3Car = new Q3Factory();
        String tire = Q3Car.createTire().tire();
        String engine = Q3Car.createEngine().engine();
        String brake = Q3Car.createBrake().brake();

        CarFactory Q7Car = new Q7Factory();
        String tiree = Q7Car.createTire().tire();
        String enginee = Q7Car.createEngine().engine();
        String brakee = Q7Car.createBrake().brake();

        String str = "当前Q3： " + tire + "   " + engine + "   " + brake + "\n" + "当前Q7： " + tiree + "   " + enginee + "   " + brakee;
        setTextStr(str);

    }
}
