public class SampleEnum1 {
    public void func() {
        Animal1 dog = Animal1.DOG;
        System.out.println(dog.name());
        System.out.println(dog.ordinal());
        if (Animal1.DOG == dog) {
            System.out.println("犬です");
        }
    }
}
