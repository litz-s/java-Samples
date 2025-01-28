public class SampleEnum2 {
    public void func() {
        Animal1 cat = Animal1.CAT;
        switch (cat) {
        case DOG:
            System.out.println("犬です");
            break;
        case CAT:
            System.out.println("猫です");
            break;
        case BIRD:
            System.out.println("鳥です");
            break;
        }
    }
}