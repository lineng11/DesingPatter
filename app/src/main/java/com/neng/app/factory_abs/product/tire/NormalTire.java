package com.neng.app.factory_abs.product.tire;

import com.neng.app.factory_abs.factory.IcarFactory;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/13.
 */
public class NormalTire implements IcarFactory.ITire {

    @Override
    public String tire() {
        return "普通的轮胎";
    }
}
