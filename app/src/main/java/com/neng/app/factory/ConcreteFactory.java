package com.neng.app.factory;

import com.neng.app.factory.product.Product;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/9.
 */
public class ConcreteFactory extends Factory {

    @Override
    public <T extends Product> T createProdict(Class<T> lsz) {
        Product product = null;
        try {
            //这里通过具体工厂来获取抽象对象产品 Product
            product = (Product) Class.forName(lsz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) product;
    }


}
