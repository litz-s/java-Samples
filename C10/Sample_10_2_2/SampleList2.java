import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleList2 {
    public void func() {
        List<String> list2 = new ArrayList<String>();
        list2.add("rose");
        list2.add("tulip");
        list2.add("sunflower");
        System.out.println("ソート前：" + list2);
        Collections.sort(list2);
        System.out.println("ソート後：" + list2);
    }
}
