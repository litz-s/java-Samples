import java.util.ArrayList;
import java.util.List;

public class SampleLambda2 {
    public void func() {
        List<String> list5 = new ArrayList<String>();
        list5.add("rose");
        list5.add("tulip");
        list5.add("sunflower");
        list5.forEach(s -> System.out.println(s));
    }
}