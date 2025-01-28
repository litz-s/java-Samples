import java.util.HashMap;
import java.util.Map;

public class SampleMap1 {
    public void func() {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1001,"東京駅前店"); 
        map1.put(1002,"品川港南口店");
        map1.put(1003,"大宮駅前店"); 
        map1.put(1004,"甲府駅前店");
        System.out.println("map1のキーと値："+map1);
        System.out.println("map1のキー「1003」の値："+map1.get(1003)); 
    }
}