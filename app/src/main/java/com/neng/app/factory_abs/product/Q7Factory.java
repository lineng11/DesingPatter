package com.neng.app.factory_abs.product;

import com.neng.app.factory_abs.factory.CarFactory;
import com.neng.app.factory_abs.factory.IcarFactory;
import com.neng.app.factory_abs.product.brake.SeniorBrake;
import com.neng.app.factory_abs.product.engine.ImportEngine;
import com.neng.app.factory_abs.product.tire.SUVTire;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class Q7Factory extends CarFactory {

    @Override
    public IcarFactory.ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IcarFactory.IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IcarFactory.IBrake createBrake() {
        return new SeniorBrake();
    }
}
