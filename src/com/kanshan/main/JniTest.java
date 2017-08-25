package com.kanshan.main;


import com.kanshan.jni.JniClear;

/**
 * Created by justpsvm on 2017/8/25.
 */
public class JniTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        JniClear.clear();

        System.out.println("Hello World");
    }
}
