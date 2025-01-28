public class SampleThread1 extends Thread {     
    @Override
    public void run() {                             
        System.out.println(this.getName());        
    }
}