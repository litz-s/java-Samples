import java.util.ArrayList;
import java.util.List;

public class SampleLambda1 {
    public void func() {
        List<String> list1 = new ArrayList<String>();
        list1.add("rose");
        list1.add("tulip");
        list1.add("sunflower");
        System.out.println(list1);
        list1.replaceAll(s -> "flower:" + s);
        System.out.println(list1);
    }
}
/*
 * 11行目と同じ役割
 * 
 * ---1---
 *  UnaryOperator<String> uo = (String s) -> {
 *      return "flower:" + s;
 *  };
 *  list1.replaceAll(uo);
 * 
 * ---2---
 *  UnaryOperator<String> uo = new UnaryOperator<String>() {
 *      @Override
 *      public String apply(String s) {
 *          return "flower:" + s;
 *      }
 *  };
 *  list1.replaceAll(uo);
 */