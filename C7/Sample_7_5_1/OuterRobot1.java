public class OuterRobot1 {
    private String name = "レッド";

    public class InnerRobot1 {
        private int number = 1;

        public void speak(){
            System.out.println("ワタシは" + name + "です！");
        }
    }

    public void func() {
        InnerRobot1 robot = new InnerRobot1();
        robot.speak();
    }
}
