package ru.imbabot.Lesson1;

import ru.imbabot.Lesson1.Obstacle.Obstacle;
import ru.imbabot.Lesson1.Obstacle.Treadmill;
import ru.imbabot.Lesson1.Obstacle.Wall;
import ru.imbabot.Lesson1.Participants.Cat;
import ru.imbabot.Lesson1.Participants.Human;
import ru.imbabot.Lesson1.Participants.Participant;
import ru.imbabot.Lesson1.Participants.Robot;

public class Main {

    public static void main(String[] args) {


        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Treadmill();
        obstacles[1] = new Wall();


        Participant[] participants = new Participant[1];
        participants[0] = new Human(2, 2, true);




        for(Obstacle o : obstacles){
            for (Participant p : participants){
                o.doIt(p);
            }
        }




    }
}
