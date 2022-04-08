package ru.imbabot.Lesson1.Participants;

public class Cat implements Participant{

    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public void run(int length) {
        System.out.println("Cat: пробежал " + length);
    }

    @Override
    public void jump(int height) {
        System.out.println("Cat: прыгнул " + height);
    }
}
