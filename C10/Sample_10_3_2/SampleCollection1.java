import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleCollection1 {
    public void func() {
        List<String> list1 = new ArrayList<String>();
        list1.add("rose");
        list1.add("tulip");
        list1.add("rose");
        list1.add("sunflower");
        System.out.println(list1);
        Set<String> set1 = new HashSet<String>(list1);
        System.out.println(set1);
    }
}
