package ru.imbabot.Lesson1.Participants;

public class Human implements Participant{

    private int maxRun;
    private int maxHeight;

    public Human(int maxRun, int maxHeight){
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }


    @Override
    public void run(int length) {
        System.out.println("Human: пробежал " + length);
    }

    @Override
    public void jump(int height) {
        System.out.println("Human: прыгнул " + height);
    }
}
