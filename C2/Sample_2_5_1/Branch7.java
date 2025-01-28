public class Branch7 { 
    public void func() {
        int num1 = 5;
        if (num1 >= 0 && num1 <= 10) {
            System.out.println("0以上かつ10以下です");
        }
        int num2 = 15;
        if (num2 < 0 || num2 > 10) {
            System.out.println("0より小さい，または10より大きい");
        }
        int num3 = 20;
        if (!(num3 <= 18)) {
            System.out.println("18以下ではない");
        }
    }
}