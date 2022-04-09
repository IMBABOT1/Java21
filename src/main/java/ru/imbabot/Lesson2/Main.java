package ru.imbabot.Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {


    private static int exceptionMethod(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 && arr[i].length != 4) {
                    throw new MyArraySizeException(arr);
                }
            }
        }


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("[0-9]+")) {
                    throw new MyArrayDataException(arr, Integer.parseInt(arr[i][j]));
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        String[][] arr = new String[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int l = 0;
                while (l < 16) {
                    arr[i][j] = String.valueOf(random.nextInt(100));
                    l++;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));

        try {
            System.out.println(exceptionMethod(arr));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}