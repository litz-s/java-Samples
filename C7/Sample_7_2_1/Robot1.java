public class Robot1 implements IFSpeak, IFWalk {
    private String name = "レッド";

    @Override
    public void speak(){
        System.out.println("ワタシは" + this.name + "です！");
    }
    @Override
    public void walk(){
        System.out.println("歩きます");
    }
}
