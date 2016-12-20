package com.neng.app.decorator;

/**
 * 抽象装饰
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/20.
 */
public abstract class PersonCloth extends Person {

    private Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    /**
     * Person 穿着抽象方法
     */
    @Override
    public void dressed() {
        person.dressed();
    }
}
