package SJMS.robot;

public class RobotTwo {

    private   RobotOne robotOne;

    public RobotTwo(RobotOne robotOne){
        this.robotOne=robotOne;
    }

    public void Sing(){
        System.out.println("唱歌");
    }

    public void Dance(){
        System.out.println("跳舞");
    }
}
