public class Robot1 {
    private static int MAX_POWER = 200;
    private static int CHARGE_POWER = 10;
    private int power = 100;

    public synchronized void rest() {
        if(this.power >= MAX_POWER){
            System.out.println("powerは満タンです");
            return;
        }
        int checkPower = this.power + CHARGE_POWER;
        if(checkPower > MAX_POWER){
            checkPower = MAX_POWER;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        this.power = checkPower;
        System.out.println("powerを回復しました：" + checkPower);
    }
}
