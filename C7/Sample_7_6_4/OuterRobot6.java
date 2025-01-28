public class OuterRobot6 {
    public void func() {
        new IFInnerBase1() {
            @Override
            public void func() {
                System.out.println("無名クラスのメソッドです");
            }
        }.func();
    }
}