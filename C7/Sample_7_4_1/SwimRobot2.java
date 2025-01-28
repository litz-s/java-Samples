public class SwimRobot2 extends RobotCore1 implements IFSwim {
    @Override
    public void speak(){
        System.out.println("ワタシは" + super.getName() + "です！");
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