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
        if (length >= maxRun && isActive == true){
            System.out.println("Robot: пробежал " + length);
        }else if (length < maxRun) {
            isActive = false;
            System.out.println("Robot: не пробежал" + length + " " + "Дальше не идет");
        }
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height && isActive == true) {
            System.out.println("Robot: прыгнул " + height);
        } else if (height < maxJump) {
            isActive = false;
            System.out.println("Robot не смог прыгнуть:" + height + " " + "Дальше не идет");
        }
    }
}