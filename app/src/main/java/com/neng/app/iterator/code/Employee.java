package com.neng.app.iterator.code;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/13.
 */
public class Employee {

    private String name;
    private int age;
    private String sex;
    private String position;  //职位

    public Employee(String name, int age, String sex, String position) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
