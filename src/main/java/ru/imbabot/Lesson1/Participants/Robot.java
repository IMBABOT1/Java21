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
        if (length >= maxRun){
            System.out.println("Robot: пробежал " + length);
        }else {
            System.out.println("Robot: не пробежал" + length);
        }
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height) {
            System.out.println("Robot: прыгнул " + height);
        }else {
            System.out.println("Robot не смогу прыгнуть:" + height);
        }
    }
}