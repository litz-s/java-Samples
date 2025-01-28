public class SampleMain12 {
    public static void main(String[] args) {
        Robot1 robotA = new Robot1();
        Robot1 robotB = new FlyRobot7();
        Robot1 robotC = new SwimRobot2();
        Robot1 robotD = new CalcRobot1();
        Robot1[] arr = {robotA, robotB, robotC, robotD};
        for (Robot1 robot: arr) {
            robot.speak();
        }
    }
}
