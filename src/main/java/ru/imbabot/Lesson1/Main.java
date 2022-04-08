package ru.imbabot.Lesson1;

import ru.imbabot.Lesson1.Obstacle.Obstacle;
import ru.imbabot.Lesson1.Obstacle.Treadmill;
import ru.imbabot.Lesson1.Obstacle.Wall;
import ru.imbabot.Lesson1.Participants.Cat;
import ru.imbabot.Lesson1.Participants.Human;
import ru.imbabot.Lesson1.Participants.Participant;
import ru.imbabot.Lesson1.Participants.Robot;

import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Cat(20, 100, true);
        participants[1] = new Human(1, 200, true);
        participants[2] = new Robot(1, 500, true);

        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Wall();
        obstacles[1] = new Treadmill();
        obstacles[2] = new Wall();

        for (Obstacle o : obstacles){
            for (Participant p : participants){
                o.doIt(p);
            }
        }
    }
}
