package ru.imbabot.Lesson1;

import ru.imbabot.Lesson1.Obstacle.Wall;
import ru.imbabot.Lesson1.Participants.Cat;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(1, 1);
        Wall wall = new Wall();
        wall.doIt(cat);
    }
}
