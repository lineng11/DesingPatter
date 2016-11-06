package com.neng.app.builder.builder;

import com.neng.app.builder.product.Computer;

/**
 * 具体构建者Builder
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/5.
 */
public class ConcreteBuilder extends Builder {
    public Computer computer;

    public ConcreteBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    protected void buildName(String name) {
        computer.setName(name);
    }

    @Override
    protected void buildDisolay(String display) {
        computer.setDisplay(display);
    }

    @Override
    protected void buildCPU(String cpu) {
        computer.setmCpu(cpu);
    }

    @Override
    protected void buildOS() {
        computer.setOS();
    }

    @Override
    public Computer create() {
        return computer;
    }

    public ConcreteBuilder construst(String name, String display, String cup) {
        buildName(name);
        buildDisolay(display);
        buildCPU(cup);
        buildOS();
        return this;
    }

    public ConcreteBuilder setName(String name) {
        buildName(name);
        return this;
    }

    public ConcreteBuilder setCPU(String cpu) {
        buildCPU(cpu);
        return this;
    }

    public ConcreteBuilder setDisplay(String display) {
        buildDisolay(display);
        return this;
    }

    public ConcreteBuilder setOs() {
        buildOS();
        return this;
    }


}
