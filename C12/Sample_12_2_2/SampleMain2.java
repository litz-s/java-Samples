public class SampleMain2 {
    public static void main(String[] args) {
        SampleThread2 thread1 = new SampleThread2("スレッド1", 3000);
        SampleThread2 thread2 = new SampleThread2("スレッド2", 1000);
        System.out.println("マルチスレッド開始");
        thread1.start();
        thread2.start();
    } 
}
