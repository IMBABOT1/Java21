package ru.imbabot.Lesson1.Participants;

public class Robot implements Participant{

    private int maxRun;
    private int maxJump;
    public boolean isActive;

    public Robot(int maxRun, int maxJump, boolean isActive){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.isActive = true;
    }


    @Override
    public void run(int length) {
        if (length >= maxRun && isActive){
            System.out.println("Robot: пробежал " + length);
        }else {
            System.out.println("Robot: не пробежал" + length);
        }
        if (isActive == false){
            System.out.println("Сломался, дальше не бежит");
        }
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height && isActive) {
            System.out.println("Robot: прыгнул " + height);
        }else {
            System.out.println("Robot не смогу прыгнуть:" + height);
        }
        if (isActive == false){
            System.out.println("Сломался, дальше не бежит");
        }
    }
}