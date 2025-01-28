import java.util.Scanner;

public class Branch6 {
    public void func() {
        int num = 0;
        System.out.println("数値を入力してください");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            String str = scanner.nextLine();
            num = Integer.parseInt(str);
            if (num > 0) {
                System.out.println("0より大きい数値が入力されました");
            } else {
                System.out.println("0以下の数値が入力されました");
            }
        }
        System.out.println(num); 
    }
}