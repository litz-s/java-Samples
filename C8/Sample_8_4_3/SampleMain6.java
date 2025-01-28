public class SampleMain6 {
    public static void main(String[] args) {
        StandardInput6 input = new StandardInput6();
        try {
            input.printSub();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}