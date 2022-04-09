package ru.imbabot.Lesson2;

public class MyArraySizeException extends RuntimeException{
    private String[][] arr;
    private int column;
    private int raw;


    public MyArraySizeException(String[][] arr) {
        super(String.format("String array invalid length %d %d '", arr.length, arr[0].length));
        this.arr = arr;
    }

}
