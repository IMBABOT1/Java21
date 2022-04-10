package ru.imbabot.Lesson5;

public class Main {

    private static void method1(){
        final int size = 10000000;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i  <arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

        float res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }

        System.out.println(res);
    }

    private static void method2(){
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        float[] first = new float[h];
        float[] second = new float[h];

        System.arraycopy(arr, 0, first, 0, h);
        System.arraycopy(arr, h, second, 0, h);

      Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <first.length ; i++) {
                    first[i] = (float)(first[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

      Thread t2 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < second.length; i++) {
                      int w = i + h;
                    second[i] = (float)(second[i] * Math.sin(0.2f + w / 5) * Math.cos(0.2f + w / 5 ) * Math.cos(0.4f + w / 2));
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(first, 0, arr, 0, h);
        System.arraycopy(second, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);

        float res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }

        System.out.println(res);
    }




    public static void main(String[] args) {
        method1();
        method2();
    }

}
