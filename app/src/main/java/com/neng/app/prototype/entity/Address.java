package com.neng.app.prototype.entity;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/8.
 */
public class Address {

    public String city;
    public String district;
    public String street;

    /**
     * 构造函数
     *
     * @param city     市
     * @param district 区
     * @param street   街道
     */
    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
