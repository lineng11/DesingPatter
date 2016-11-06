package com.neng.app.singleton;

/**
 * 单例模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/4.
 */
public class Singleton {

    private boolean isSwitch = false;


    /*************************** 懒汉式 Start *****************************************/

//    private static Singleton instance;
//
//    private Singleton() {
//    }
//    public static synchronized Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /*************************** 懒汉式 end *****************************************/


    /******************** Double Check Lock （DCL） Start ******************************/

//    private static Singleton instance;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    /******************* Double Check Lock （DCL） end *****************************/


    /******************
     * 静态类部类 Start
     ****************/

    private static Singleton instance;

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    /******************
     * 静态类部类 end
     ***********************/


    public boolean isSwitch() {
        return isSwitch;
    }

    public void setSwitch(boolean aSwitch) {
        isSwitch = aSwitch;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "当前开关状态 isSwitch=" + isSwitch +
                '}';
    }
}
