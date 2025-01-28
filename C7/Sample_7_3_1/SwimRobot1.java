public class SwimRobot1 implements IFSwim {
    private String name = "レッド";

    @Override
    public void speak(){
        System.out.println("ワタシは" + this.name + "です！");
    }
    @Override
    public void walk(){
        System.out.println("歩きます");
    }
    @Override
    public void swim(){
        System.out.println("泳ぎます");
    }
}