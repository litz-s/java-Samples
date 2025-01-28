public class Robot4 {
    private String name;
    private int power;
    public static final int MIN_POWER = 0;

    public Robot4() {                          
        this("レッド", 100);                   
    }
    public Robot4(String name, int power) {     
        if(!name.isEmpty()) {
            this.name = name;
        }
        if(Robot4.MIN_POWER < power) {
            this.power = power;
        }
    }
    public void speak() {
        System.out.println("ワタシは" + this.name + "です！");
    }
    public String getName() {
        return this.name;
    }
    public int getPower() {
        return this.power;
    }
}
