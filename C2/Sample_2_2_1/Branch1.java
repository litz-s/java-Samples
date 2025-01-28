import java.util.Scanner;

public class Branch1 {
    public void func() {
        System.out.println("数値を入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);
        if (num > 0) {
            System.out.println("0より大きい数値が入力されました");
        }
    }
}
