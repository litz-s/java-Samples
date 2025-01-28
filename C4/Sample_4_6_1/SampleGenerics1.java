public class SampleGenerics1<T> {
    public T val;

    public void func(T arg) {
        val = arg;
        System.out.println(arg);
    }
}
