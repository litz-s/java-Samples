public class SampleMain6 {
    public static void main(String[] args) {
        OuterRobot1 oRobot = new OuterRobot1(); 
        oRobot.func();
        OuterRobot1.InnerRobot1 iRobot = oRobot.new InnerRobot1();
        iRobot.speak();
    }
}
