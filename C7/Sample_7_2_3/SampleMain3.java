public class SampleMain3 {
    public static void main(String[] args) {
        IFSpeak robotA = new Robot1(); 
        robotA.speak();
        Robot1 robotB = (Robot1)robotA;
        robotB.speak();
    }
}