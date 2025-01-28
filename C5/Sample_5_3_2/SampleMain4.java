public class SampleMain4 {
    public static void main(String[] args) {
        Robot4 robotA = new Robot4();   
        robotA.speak();
        System.out.println(robotA.getPower());
        Robot4 robotB = new Robot4("ピンク", 80); 
        robotB.speak();
        System.out.println(robotB.getPower());
    }
}