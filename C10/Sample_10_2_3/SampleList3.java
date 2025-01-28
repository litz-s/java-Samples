import java.util.ArrayList;
import java.util.List;

public class SampleList3 {
    public void func() {
        List<String> list3 = new ArrayList<String>();
        list3.add("rose");
        list3.add("tulip");
        list3.add("sunflower");
        for (String flower : list3) {
            System.out.println(flower);
        }
    }
}