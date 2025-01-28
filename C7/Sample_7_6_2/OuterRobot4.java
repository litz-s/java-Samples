public class OuterRobot4 {
    public void func () {
        new InnerBase1() {
            @Override
            public void func() {
                System.out.println("無名クラスのメソッドです");
            }
        }.func();
    }
}