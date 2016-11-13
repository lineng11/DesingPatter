package com.neng.app.factory_abs.product.engine;

import com.neng.app.factory_abs.factory.IcarFactory;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class ImportEngine implements IcarFactory.IEngine {

    @Override
    public String engine() {
        return "进口发动机";
    }
}
