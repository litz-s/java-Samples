public class Robot3 {
    private String name = "レッド";

    public Robot3(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }
    public void speak() {
        System.out.println("ワタシは" + this.name + "です！");
    }
    public String getName() {
        return this.name;
    }
}
