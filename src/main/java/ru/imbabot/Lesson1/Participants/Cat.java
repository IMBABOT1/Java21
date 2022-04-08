package ru.imbabot.Lesson1.Participants;

public class Cat implements Participant {


    private int maxDistance;
    public int maxHeight;

    public Cat(int runDistance, int runHeight){
        this.maxDistance = runDistance;
        this.maxHeight = runHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance > maxDistance){
            System.out.println("кот не пробежал");
            return false;
        }
        return true;
    }

    @Override
    public boolean jump(int height) {
        if (height > maxHeight){
            System.out.println("кот не проплыл");
            return false;
        }

        return false;
    }
}
