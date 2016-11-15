package com.neng.app.activity;

import com.neng.app.builder.builder.ConcreteBuilder;
import com.neng.app.builder.product.Computer;
import com.neng.app.builder.product.MacBook;
import com.neng.app.builder.product.ThinkPad;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/5.
 */
public class BuilderActivity extends BaseActivity {
    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

        Computer mMacConputer = new ConcreteBuilder(new MacBook())
                .setName("Macbook pro 2016 新款 Touch Bar")
                .setDisplay("13.3 英寸 (对角线) LED 背光 Retina 显示屏")
                .setCPU("2.9GHz 四核 Intel Core i7 处理器 Turbo Boost 最高可达 3.8GHz")
                .setOs()
                .create();


//        Computer mMacConputer = new ConcreteBuilder(new MacBook())
//                .construst("Macbook pro 2016 新款 Touch Bar","13.3 英寸 (对角线) LED 背光 Retina 显示屏","2.9GHz 四核 Intel Core i7 处理器 Turbo Boost 最高可达 3.8GHz")
//                .create();

        Computer mThinkPadComputer = new ConcreteBuilder(new ThinkPad())
                .setName("ThinkPad X1 Carbon (20FBA00XCD) ")
                .setDisplay("14英寸 FHD IPS LED背光显示屏")
                .setCPU("第六代智能英特尔酷睿i5处理器 i5-6200U 2.3GHz睿频至2.8GHz")
                .setOs()
                .create();


        setTextStr(mMacConputer.toString());
//        setTextStr(mThinkPadComputer.toString());
    }
}
