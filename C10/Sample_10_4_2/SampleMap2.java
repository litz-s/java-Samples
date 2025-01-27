import java.util.HashMap;
import java.util.Map;

public class SampleMap2 {
    public void func() {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1001, "東京駅前店");
        map1.put(1002, "品川港南口店");
        map1.put(1003, "大宮駅前店");
        map1.put(1004, "甲府駅前店");
        for (Integer i : map1.keySet()) {
            System.out.println("キー：" + i);
        }
        for (String i : map1.values()) {
            System.out.println("値：" + i);
        }
    }
}