package com.kanshan.jni;

/**
 * Created by justpsvm on 2017/8/25.
 *
 *  jni 清屏类
 */
public class JniClear {

    private JniClear(){}


    static{
        System.loadLibrary("JniClear");
    }

    public static native void clear();
}
