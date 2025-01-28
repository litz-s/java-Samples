public class SampleGenerics2 {
    public <T> void func1(T arg) {
        System.out.println(arg);
    }
    public <T> T func2(T arg) {
        return arg;
    }
}
