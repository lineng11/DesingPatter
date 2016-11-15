package com.neng.app.activity;

import com.neng.app.factory.ConcreteFactory;
import com.neng.app.factory.Factory;
import com.neng.app.factory.product.ConcreteProductA;
import com.neng.app.factory.product.ConcreteProductB;
import com.neng.app.factory.product.ConcreteProductC;
import com.neng.app.factory.product.Product;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/9.
 */
public class FactoryActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

        //获取工厂的抽象类
        Factory factory = new ConcreteFactory();

        //获取产品A抽象
        Product productA = factory.createProdict(ConcreteProductA.class);
        //通过抽象产品来获取产品A methid方法
        String txtA = productA.methid();

        Product productB = factory.createProdict(ConcreteProductB.class);
        String txtB = productB.methid();

        Product productC = factory.createProdict(ConcreteProductC.class);
        String txtC = productB.methid();
        
        setTextStr(txtA + "\n" + txtB + "\n" + txtC);
    }
}
