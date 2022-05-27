package com.SJMS;

public class RobotTwoImpl implements  RobotTwo {
    private Robot robot;
    public RobotTwoImpl(Robot robot){
        this.robot=robot;
    }
    public String dance() {
        return "第二代跳舞";
    }

    public String say() {
        return robot.say();
    }

    public String blink() {
        return robot.blink();
    }
}
