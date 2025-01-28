public class OuterRobot7 {
    public void func() {
        IFInnerBase2 inner = (int a, int b) -> {
            if(a > b){
                return a;
            }
            return b;
        };
        System.out.println(inner.checkNum(5, 10));
    }
}
