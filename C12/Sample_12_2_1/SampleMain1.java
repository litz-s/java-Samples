public class SampleMain1 {
    public static void main(String[] args) {
        SampleThread1 thread1 = new SampleThread1();  
        SampleThread1 thread2 = new SampleThread1();
        System.out.println("マルチスレッド開始");
        thread1.start();
        thread2.start();
    }    
}
