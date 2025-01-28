public class SampleMain2 {
    public static void main(String[] args) {
        Robot2 robot = new Robot2();
        robot.speak();
        robot.setName("ブルー");
        robot.speak();
        System.out.println(robot.getName());
        robot.setName("");
        robot.speak();
    }
}
