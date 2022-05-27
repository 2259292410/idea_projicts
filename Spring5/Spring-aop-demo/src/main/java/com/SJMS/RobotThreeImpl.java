package com.SJMS;

public class RobotThreeImpl  implements RobotThree{
    private RobotTwo robot;
    public RobotThreeImpl(RobotTwo robot){
        this.robot=robot;
    }
    public String sing() {
        return "第三代唱歌";
    }

    public String dance() {
        return robot.dance();
    }

    public String say() {
        return robot.say();
    }

    public String blink() {
        return robot.blink();
    }
}
