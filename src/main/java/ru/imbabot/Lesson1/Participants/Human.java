package ru.imbabot.Lesson1.Participants;

public class Human implements Participant{

    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public void run(int length) {
        if (length >= maxRun){
            System.out.println("Human: пробежал " + length);
        }else {
            System.out.println("Human: не пробежал" + length);
        }
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height) {
            System.out.println("Human: прыгнул " + height);
        }else {
            System.out.println("Human не смогу прыгнуть:" + height);
        }
    }
}