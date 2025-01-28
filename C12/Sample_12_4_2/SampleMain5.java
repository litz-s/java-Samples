public class SampleMain5 {
    public static void main(String[] args) {
        Robot1 robot = new Robot1();
        SampleThread4 thread1 = new SampleThread4("スレッド1", robot);
        SampleThread4 thread2 = new SampleThread4("スレッド2", robot);
        thread1.start();
        thread2.start();
    }
}
