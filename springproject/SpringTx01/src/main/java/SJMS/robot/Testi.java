package SJMS.robot;

public class Testi {
    public static void main(String[] args) {

        RobotOne robotOne =new RobotOne();

        RobotTwo robotTwo=new RobotTwo(robotOne);

        robotTwo.Sing();
    }
}
