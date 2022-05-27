package com.SJMS;

public class test {
    public static void main(String[] args) {
//       Phone redmiPhone = new RedmiPhone();
//        DecoratorPhone decoratorPhone = new DecoratorPhone(redmiPhone);
//        System.out.println(decoratorPhone.fourGCall());
//        System.out.println(decoratorPhone.fourGSend());
        Robot robot = new RobotImpl();
        RobotTwo robotTwo = new RobotTwoImpl(robot);
        RobotThreeImpl robotThree = new RobotThreeImpl(robotTwo);
        System.out.println(robotThree.say());
        System.out.println(robotThree.blink());
        System.out.println(robotThree.dance());
        System.out.println(robotThree.sing());
    }
}
