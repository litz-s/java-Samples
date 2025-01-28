public class SampleMain11 {
    public static void main(String[] args) {
        SampleGenerics1<String> test = new SampleGenerics1<String>();
        test.func("Hello");

        SampleGenerics1<Integer> test2 = new SampleGenerics1<Integer>();
        Integer num = new Integer(100); 
        test2.func(num);
    }
}
