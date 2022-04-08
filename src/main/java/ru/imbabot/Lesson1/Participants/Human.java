package ru.imbabot.Lesson1.Participants;

public class Human implements Participant{

    private int maxRun;
    private int maxJump;
    public boolean isActive;

    public Human(int maxRun, int maxJump, boolean isActive){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.isActive = true;
    }


    @Override
    public void run(int length) {
        if (length >= maxRun && isActive == true){
            System.out.println("Human: пробежал " + length);
        }else {
            System.out.println("Human: не пробежал" + length + " " + "Дальше не идет");
            isActive = false;
        }
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height && isActive==true) {
            System.out.println("Human: прыгнул " + height);
        }else {
            System.out.println("Human не смог прыгнуть:" + height + " " + "Дальше не идет");
            isActive = false;
        }
    }
}