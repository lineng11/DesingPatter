package com.neng.app.activity;

import android.view.View;

import com.neng.app.composite.Dir;
import com.neng.app.composite.File;
import com.neng.app.composite.Folder;

/**
 * 组合模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class CompositeActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);

        //创建一个C盘【C文件】
        Dir diskC = new Folder("C");
        diskC.addDir(new File("Android.txt"));

        //创建一个 Wind 文件夹
        Dir dieWin = new Folder("Windows");
        dieWin.addDir(new File("Studiao.exe"));
        dieWin.addDir(new File("git.txt"));
        //Wind文件夹 存放C盘下
        diskC.addDir(dieWin);

        //创建一个 dirMac 文件夹
        Dir dirMac = new Folder("Mac os");
        dirMac.addDir(new File("MacBook pro.txt"));
        dirMac.addDir(new File("ios体系.txt"));
        //Mac os文件夹 存放C盘下
        diskC.addDir(dirMac);

        //打印C盘下面所有文件夹|以及文件
        diskC.print();
    }
}
