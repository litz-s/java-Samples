public class Robot4 {
    public static final int MIN_POWER = 0;
    public int power = 100;

    public void downPower(int damage) {
        if(Robot4.MIN_POWER > (this.power - damage)) {
            this.power = Robot4.MIN_POWER;
        } else {
            this.power = this.power - damage;
        }
        System.out.println("現在のパワー：" + power);
    }
}
