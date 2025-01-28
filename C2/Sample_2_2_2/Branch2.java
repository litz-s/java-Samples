import java.util.Scanner;

public class Branch2 {
    public void func() {
        System.out.println("Helloを入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("Hello")) {
            System.out.println("一致しました");
        }
    }
}
