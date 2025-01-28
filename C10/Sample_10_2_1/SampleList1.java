import java.util.ArrayList;
import java.util.List;

public class SampleList1 {
    public void func() {
        List<String> list1 = new ArrayList<String>();
        list1.add("rose");
        list1.add("tulip");
        list1.add("sunflower");
        System.out.println("list1の要素：" + list1);
        System.out.println("list1の3番目の要素：" + list1.get(2));
    }
}