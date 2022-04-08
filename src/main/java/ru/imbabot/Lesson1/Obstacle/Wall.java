package ru.imbabot.Lesson1.Obstacle;

import ru.imbabot.Lesson1.Participants.Participant;

public class Wall implements Obstacle {

    int height = 20;

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
