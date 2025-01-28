public class SampleMain3 {
    public static void main(String[] args) {
        SampleRunnable1 runnable1 = new SampleRunnable1(3000);
        SampleRunnable1 runnable2 = new SampleRunnable1(1000);
        Thread thread1 = new Thread(runnable1, "スレッド1");
        Thread thread2 = new Thread(runnable2, "スレッド2");
        System.out.println("マルチスレッド開始");
        thread1.start();
        thread2.start();
    }
}
