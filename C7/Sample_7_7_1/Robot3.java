public class Robot3 {
    public void func() {
        IFInnerBase1 inner = () -> {System.out.println("コンニチハ！");};
        inner.func();
    }
}
