package com.neng.app.composite;

import android.util.Log;

import java.util.List;

/**
 * 文件
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class File extends Dir {

    private String TAG = this.getClass().getSimpleName();

    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void rmDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void print() {
        Log.e(TAG, "文件： " + getName());
    }

    @Override
    public List<Dir> getFiles() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }
}
