package ru.imbabot.Lesson1.Participants;

public class Cat implements Participant{

    private int maxJump;
    private int maxRun;
    private boolean action;


    public Cat(int maxJump, int maxRun, boolean action) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.action = action;
    }


    @Override
    public void jump(int height) {
        if (height <= maxJump && action == true){
            System.out.println("Cat jump: " + maxJump);
        }else if (height > maxJump && action == true){
            action = false;
            System.out.println("Cat can't jump " + height + " remove from distance");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun && action == true){
            System.out.println("Cat run: " + maxRun);
        }else if (distance > maxRun && action == true){
            action = false;
            System.out.println("Cat can't run " + distance + " remove from distance");
        }
    }
}
