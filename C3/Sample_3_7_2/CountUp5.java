public class CountUp5 {
    public void func() {
        int i = 0;
        while (i < 5) {
            if(i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i + "回目");
            i++;
        }
    }
}
