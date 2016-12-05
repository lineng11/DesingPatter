package com.neng.app.interpreter;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/5.
 */
public class Entity {

    private Integer numo;

    private Integer numt;

    public Entity(Integer numo, Integer numt) {
        this.numo = numo;
        this.numt = numt;
    }


    public Integer getNumo() {
        return numo;
    }

    public void setNumo(Integer numo) {
        this.numo = numo;
    }

    public Integer getNumt() {
        return numt;
    }

    public void setNumt(Integer numt) {
        this.numt = numt;
    }
}
