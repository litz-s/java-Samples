import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SampleStream2 {
    public void func() {
        List<String> list1 = new ArrayList<String>();
        list1.add("rose");
        list1.add("lavender");
        list1.add("lily");
        List<String> list2 = list1.stream()
                .filter(s -> s.startsWith("l"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list2);      
    }
}