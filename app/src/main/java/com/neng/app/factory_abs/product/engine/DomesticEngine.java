package com.neng.app.factory_abs.product.engine;

import com.neng.app.factory_abs.factory.IcarFactory;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class DomesticEngine implements IcarFactory.IEngine {

    @Override
    public String engine() {
        return "国产发动机";
    }
}
