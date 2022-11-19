package com.test1;

public class Main {

    private static Test a;

    private static class Test{

        @Override
        protected void finalize() throws Throwable {
            //System.out.println(this + ", 开始了它的救赎之路");
            System.out.println(Thread.currentThread());
            a = this;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        a = new Test();
        a = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(a);

        a = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(a);

    }

}
