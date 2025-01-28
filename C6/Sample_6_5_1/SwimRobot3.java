public class SwimRobot3 extends Robot1 {
    @Override
    public void speak() {
        System.out.println(super.name);
        super.speak();
        System.out.println("ワタシは水中を泳ぐロボットです！！");
    }
}
