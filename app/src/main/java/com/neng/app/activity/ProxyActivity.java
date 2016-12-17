package com.neng.app.activity;

import android.util.Log;
import android.view.View;

import com.neng.app.proxy.dome.DynamicProxy;
import com.neng.app.proxy.dome.ILawsuit;
import com.neng.app.proxy.dome.Lawyer;
import com.neng.app.proxy.dome.XiaoMin;
import com.neng.app.proxy.stencil.ProxySubject;
import com.neng.app.proxy.stencil.RealSubject;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class ProxyActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {
        client();
    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);
        XiaoMin xiaoMin = new XiaoMin();
        //代理律师帮忙诉讼业务
        Lawyer lawyer = new Lawyer(xiaoMin);
        //律师代理诉讼
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

        //------------------------ 动态代理
        Log.d(this.getClass().getSimpleName(), "=========================动态代理 client: =================================");
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMin);
        ClassLoader mClassLoader = xiaoMin.getClass().getClassLoader();
        //动态构造一个代理律师
        ILawsuit mILawsuit = (ILawsuit) Proxy.newProxyInstance(mClassLoader, new Class[]{ILawsuit.class}, dynamicProxy);
        //律师代理诉讼
        mILawsuit.submit();
        mILawsuit.burden();
        mILawsuit.defend();
        mILawsuit.finish();
    }

    /**
     * 实现代理模式模版visit 业务
     */
    private void client() {

        //要实现一个Visit业务
        RealSubject realSubject = new RealSubject();
//        realSubject.visit();  //体现代理模式、让另一个代理对象来实现

        //代理对象
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();
    }
}
