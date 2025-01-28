public class Robot2 {
    private String name = "レッド";

    public void speak() {
        System.out.println("ワタシは" + this.name + "です！");
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }
}
