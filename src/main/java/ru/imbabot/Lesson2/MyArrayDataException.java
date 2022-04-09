package ru.imbabot.Lesson2;

public class MyArrayDataException extends RuntimeException{

    private int data;

    public MyArrayDataException(String[][]arr, int data) {
        super(String.format("Invalid symbol in %d", data));
    }

}
