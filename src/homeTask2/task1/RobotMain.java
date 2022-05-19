package homeTask2.task1;

public class RobotMain {
    public static void main(String[] args) {

        Robot [] array = {new RobotCoocker(), new RobotDancer(), new CoffeRobot()};
        for(Robot r:array){
            r.work();
        }
    }
}
