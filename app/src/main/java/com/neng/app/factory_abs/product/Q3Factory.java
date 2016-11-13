package com.neng.app.factory_abs.product;

import com.neng.app.factory_abs.factory.CarFactory;
import com.neng.app.factory_abs.factory.IcarFactory;
import com.neng.app.factory_abs.product.brake.NormalBrake;
import com.neng.app.factory_abs.product.engine.DomesticEngine;
import com.neng.app.factory_abs.product.tire.NormalTire;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class Q3Factory extends CarFactory {

    @Override
    public IcarFactory.ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IcarFactory.IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IcarFactory.IBrake createBrake() {
        return new NormalBrake();
    }
}
