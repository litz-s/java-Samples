public class SampleMain2 {
    public static void main(String[] args) {
        Robot2 robot = new Robot2();
        robot.speak();
        IFSpeakEx.thanks();
        System.out.println(IFSpeakEx.DEF_NAME);
    }
}
