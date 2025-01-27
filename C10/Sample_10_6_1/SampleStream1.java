import java.util.ArrayList;
import java.util.List;

public class SampleStream1 {
    public void func() {
        List<String> list1 = new ArrayList<String>();
        list1.add("rose");
        list1.add("lavender");
        list1.add("lily");
        list1.stream()
                .filter(s -> s.startsWith("l"))     //数字の1ではなく英語のlであることに注意
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));      
    }
}