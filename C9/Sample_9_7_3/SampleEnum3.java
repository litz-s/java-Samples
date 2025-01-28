public class SampleEnum3 {
    public void func() {
        Animal1[] ary = Animal1.values();
        for (Animal1 animal : ary) {
            System.out.println(animal.name());
        }
        System.out.println(Animal1.valueOf("DOG"));
        //System.out.println(Animal1.valueOf("RABBIT"));
    }
}