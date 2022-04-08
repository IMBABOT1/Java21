package ru.imbabot.Lesson1.Obstacle;

import ru.imbabot.Lesson1.Participants.Participant;

public class Treadmill implements Obstacle {

    private int length = 100;

    @Override
    public void doIt(Participant p) {
        p.run(length);
    }
}
