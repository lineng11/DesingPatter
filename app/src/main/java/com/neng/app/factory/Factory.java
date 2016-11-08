package com.neng.app.factory;

import com.neng.app.factory.product.Product;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/9.
 */
public abstract class Factory {

    public abstract <T extends Product> T createProdict(Class<T> lsz);
}
