public class OuterRobot2 {
    public String name = "レッド";
    static int power = 100;

    public static class InnerRobot2 {
        public void speak(){
            System.out.println("静的なメンバクラスです");
            System.out.println(OuterRobot2.power);
        }
    }
}
