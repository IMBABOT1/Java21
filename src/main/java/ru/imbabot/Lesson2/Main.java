package ru.imbabot.Lesson2;

public class Main {


    private static int exceptionMethod(String[][]arr) throws MyArrayDataException, MyArraySizeException{
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 && arr[i].length != 4){
                    throw new MyArraySizeException(arr);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (!arr[i][j].matches("[0-9]+")){
                    throw new  MyArrayDataException(Integer.parseInt(arr[i][j]));
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
