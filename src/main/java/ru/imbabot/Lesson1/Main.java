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
        Cat cat = new Cat(1, 201);
        Wall wall = new Wall();
        wall.doIt(cat);


        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Treadmill();
        obstacles[1] = new Wall();


        Participant[] participants = new Participant[3];
        participants[0] = new Human(200, 2);
        participants[1] = new Cat(500, 20);
        participants[2]=  new Robot(5000, 100);



        for(Obstacle o : obstacles){
            for (Participant p : participants){
                o.doIt(p);
            }
        }




    }
}
