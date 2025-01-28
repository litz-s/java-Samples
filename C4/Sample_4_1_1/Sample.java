public class Sample {
    public static void main(String[] args) {
        Robot robotA = new Robot();
        Robot robotB = new Robot();
        Robot robotC = robotA;

        if (robotA == robotB) {
            System.out.println("robotAとrobotBは同じです");
        } else {
            System.out.println("robotAとrobotBは異なります");
        }
        if (robotA == robotC) {
            System.out.println("robotAとrobotCは同じです");
        } else {
            System.out.println("robotAとrobotCは異なります");
        }
    }
}
