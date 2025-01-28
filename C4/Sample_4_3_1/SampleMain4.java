public class SampleMain4 {
    public static void main(String[] args) {
        Robot1 robot = new Robot1();
        robot.speak();
        System.out.println(robot.name);
        robot.name = "ブルー";
        robot.speak();
        System.out.println(robot.name);
    }
}
