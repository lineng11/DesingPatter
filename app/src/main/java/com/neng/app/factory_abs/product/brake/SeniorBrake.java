package com.neng.app.factory_abs.product.brake;

import com.neng.app.factory_abs.factory.IcarFactory;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class SeniorBrake implements IcarFactory.IBrake {
    @Override
    public String brake() {
        return "高级制动";
    }
}
