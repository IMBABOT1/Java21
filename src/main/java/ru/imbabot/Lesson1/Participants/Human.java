package ru.imbabot.Lesson1.Participants;

public class Human implements Participant {

    private int maxDistance;
    public int maxHeight;

    public Human(int runDistance, int runHeight){
        this.maxDistance = runDistance;
        this.maxHeight = runHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance > maxDistance){
            System.out.println("Human не пробежал");
            return false;
        }
        return true;
    }

    @Override
    public boolean jump(int height) {
        if (height > maxHeight){
            System.out.println("Human не проплыл");
            return false;
        }

        return false;
    }
}