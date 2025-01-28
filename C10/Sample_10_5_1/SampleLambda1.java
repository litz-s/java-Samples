import java.util.ArrayList;
import java.util.List;

public class SampleLambda1 {
    public void func() {
        List<String> list1 = new ArrayList<String>();
        list1.add("rose");
        list1.add("tulip");
        list1.add("sunflower");
        System.out.println(list1);
        list1.replaceAll(s -> "flower：" + s);
        System.out.println(list1);
    }
}
