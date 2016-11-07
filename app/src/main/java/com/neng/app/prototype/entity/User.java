package com.neng.app.prototype.entity;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/8.
 */
public class User implements Cloneable {

    public int age;
    public String name;
    public String phone;
    public Address address;

    @Override
    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();    //克隆一个新的User
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
