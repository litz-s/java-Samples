import java.util.Scanner;

public class StandardInput2 {
    public void func() {
        System.out.println("メッセージを入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("入力したのは：" + str);
    }
}
