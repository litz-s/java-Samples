import java.util.Scanner;

public class StandardInput1 {
    public void func() {
        System.out.println("メッセージを入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
