public class SampleMain2 {
    public static void main(String[] args) {
        SwimRobot1 robot = new SwimRobot1();
        robot.speak();
        robot.oxygenInfo();
        System.out.println(robot.getOxygen());
    }
}