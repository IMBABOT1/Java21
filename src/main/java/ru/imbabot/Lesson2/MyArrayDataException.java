package ru.imbabot.Lesson2;

public class MyArrayDataException extends Exception{



    public MyArrayDataException(int first, int second) {
        super(String.format("Invalid symbol in array %d %d", first, second));
    }

}
