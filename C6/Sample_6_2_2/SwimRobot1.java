public class SwimRobot1 extends Robot1 {
    private int oxygen = 100;

    public void oxygenInfo() {
        System.out.println("酸素残量：" + this.oxygen);
    }
    public int getOxygen(){
        return this.oxygen;
    }
}
