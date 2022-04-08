package ru.imbabot.Lesson1.Participants;

public class Robot implements Participant{

    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void run(int length) {
        System.out.println("Robot: пробежал " + length);
    }

    @Override
    public void jump(int height) {
        System.out.println("Robot: пробежал " + height);
    }
}