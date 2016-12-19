package com.neng.app.composite;

import android.util.Log;

import java.util.List;
import java.util.ListIterator;

/**
 * 文件夹
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class Folder extends Dir {

    private String TAG = this.getClass().getSimpleName();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        Log.e(TAG, "文件夹： " + getName());
        ListIterator iterator = dirs.listIterator();
        while (iterator.hasNext()) {
            Dir dir = (Dir) iterator.next();
            dir.print();
        }
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
