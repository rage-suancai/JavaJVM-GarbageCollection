package com.test2;

public class Main {

    public static void main(String[] args) {

        Object o = new Object();
        o = null;
        System.gc();

    }

}
