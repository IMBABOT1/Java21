package ru.imbabot.Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {


    private static int exceptionMethod(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException(arr);
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = "1";


               if (!arr[i][j].matches("[0-9]+")){
                   throw new MyArrayDataException(i,j);
               }
               sum += Integer.parseInt(arr[i][j]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] arr = new String[0][0];
        try {
            System.out.println(exceptionMethod(arr));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }
}