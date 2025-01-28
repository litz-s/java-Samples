public class OuterRobot5 {
    public void func () {
        InnerBase1 inner = new InnerBase1() {
            @Override
            public void func(){
                System.out.println("無名クラスのメソッドです");
            }
        };
        inner.func();
    }
}
