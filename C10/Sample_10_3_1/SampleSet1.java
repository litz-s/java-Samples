import java.util.HashSet;
import java.util.Set;

public class SampleSet1 {
    public void func() {
        Set<String> set1 = new HashSet<String>();
        set1.add("lily");
        set1.add("rose"); 
        set1.add("tulip"); 
        set1.add("sunflower");
        set1.add("rose");
        for (String str : set1){
            System.out.println("要素は：" + str);
        }
    }
}