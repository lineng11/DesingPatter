package com.neng.app.builder.builder;

import com.neng.app.builder.product.Computer;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/5.
 */
public abstract class Builder {


    protected abstract void buildName(String name);

    protected abstract void buildDisolay(String display);

    protected abstract void buildCPU(String cpu);

    protected abstract void buildOS();

    protected abstract Computer create();
}
