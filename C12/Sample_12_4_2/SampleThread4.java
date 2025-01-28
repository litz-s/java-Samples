public class SampleThread4 extends Thread {
    private Robot1 robot = null;

    public SampleThread4(String name, Robot1 robot) {
        super(name);
        this.robot = robot;
    }
    @Override
    public void run() {
        this.robot.rest();
    }
}
