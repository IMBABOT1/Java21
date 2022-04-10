package ru.imbabot.Lesson5;

public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;

    private static void method1(){
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

        float res = 0;
        for (int i = 0; i <arr.length ; i++) {
            res += arr[i];
        }

        System.out.println(res);
    }


    private static void method2(){
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        float[] first = new float[h];
        float[] second = new float[size];


        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, first, 0, h);
        System.arraycopy(arr, h, second, h, h);

        Thread t = new Thread(new MyThread(first, 0));
        Thread t2 = new Thread(new MyThread(second, h));
        t.start();
        t2.start();

        try {
            t.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(first, 0, arr, 0, h);
        System.arraycopy(second, h, arr, h, h);

        float res = 0;
        for (int i = 0; i <arr.length ; i++) {
            res += arr[i];
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
