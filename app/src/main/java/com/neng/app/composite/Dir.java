package com.neng.app.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件和文件夹的抽象类
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public abstract class Dir {

    protected List<Dir> dirs = new ArrayList<>();
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * add 文件或文件夹
     *
     * @param dir
     */
    public abstract void addDir(Dir dir);


    /**
     * rm 文件或文件夹
     *
     * @param dir
     */
    public abstract void rmDir(Dir dir);


    /**
     * 清空文件夹下面的所有元素
     */
    public abstract void clear();


    /**
     * 输出目录下的所有元素
     */
    public abstract void print();


    /**
     * 获取文件夹下面的所有文件或子文件夹
     *
     * @return
     */
    public abstract List<Dir> getFiles();


    /**
     * 获取文件或文件夹名
     * @return
     */
    public String getName() {
        return name;
    }

}
