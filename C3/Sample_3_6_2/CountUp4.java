public class CountUp4 {
    public void func() {
        int index1 = 0;
        while(index1 < 0) {
            System.out.println("while文：" + index1 + "回目");
            index1++;
        }

        int index2 = 0;
        do {
            System.out.println("do-while文：" + index2 + "回目");
            index2++;
        } while(index2 < 0);
    }
}
