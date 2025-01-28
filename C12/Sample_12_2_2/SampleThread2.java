public class SampleThread2 extends Thread {
    private int time = 0;

    public SampleThread2(String name, int time){
        super(name);          
        this.time = time;   
    }
    @Override
    public void run() {
         try {                                
             System.out.println(this.getName() + "：開始");
             Thread.sleep(this.time);               
        } catch (InterruptedException e) {
            System.out.println(this.getName() + e.getMessage());
        } finally {
            System.out.println(this.getName() + "：終了");
        }
    }
}
