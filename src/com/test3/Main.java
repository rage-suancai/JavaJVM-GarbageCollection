package com.test3;

import java.lang.ref.*;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {

        /*SoftReference<Object> reference = new SoftReference<>(new Object());
        System.out.println(reference.get());*/

        /*ReferenceQueue<Object> queue = new ReferenceQueue<>();
        SoftReference<Object> reference = new SoftReference<>(new Object(), queue);
        System.out.println(reference);

        try {
            List<String> list = new ArrayList<>();
            while (true) list.add(new String("yxsnb"));
        }catch(Throwable t) {
            System.out.println("发生了内存溢出" + t.getMessage());
            System.out.println("软引用对象: " + reference.get());
            System.out.println(queue.poll());
        }*/

        /*WeakReference<Object> reference = new WeakReference<>(new Object());
        System.out.println(reference.get());*/

        /*SoftReference<Object> softReference = new SoftReference<>(new Object());
        WeakReference<Object> weakReference = new WeakReference<>(new Object());
        System.gc();
        System.out.println("软引用对象: " + softReference.get());
        System.out.println("弱引用对象: " + weakReference.get());*/

        Integer a = new Integer(1);
        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(a, "yxsnb");
        System.out.println(weakHashMap);
        a = null;
        System.gc();
        System.out.println(weakHashMap);

        //PhantomReference<Object> phantomReference = new PhantomReference<>(new Object());

    }

}
