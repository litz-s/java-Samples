public class SampleRunnable1 implements Runnable {     
    private int time = 0;

    public SampleRunnable1(int time) {
        this.time = time;
    }
    @Override
    public void run() {                                  
        Thread thread = Thread.currentThread();          
        try {
            System.out.println(thread.getName() + "：開始");
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + e.getMessage());
        } finally {
            System.out.println(thread.getName()  + "：終了");
        }
    }
}