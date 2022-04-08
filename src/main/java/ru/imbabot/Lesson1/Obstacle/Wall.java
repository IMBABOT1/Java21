package ru.imbabot.Lesson1.Obstacle;

import ru.imbabot.Lesson1.Participants.Participant;

public class Wall implements Obstacle{

    private int height = 50;

    @Override
    public void doIt(Participant p) {
        p.jump(height);
    }
}
