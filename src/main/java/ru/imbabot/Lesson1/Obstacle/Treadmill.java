package ru.imbabot.Lesson1.Obstacle;

import ru.imbabot.Lesson1.Participants.Participant;

public class Treadmill implements Obstacle {

    private int distance = 1000;

    @Override
    public void doIt(Participant participant) {
        participant.run(distance);
    }
}
