public class OuterRobot3 {
    private String name = "ブルー";

    public void func() {
        int power = 100;
        class InnerRobot {
            public void func(){
                System.out.println("ローカルクラスのメソッドです");
                System.out.println("ワタシは" + name + "です");
                System.out.println("パワー：" + power);
            }
        }
        InnerRobot iRobot = new InnerRobot();
        iRobot.func();
    }
}