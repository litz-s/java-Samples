import java.util.Scanner;

public class InputLoop1 {
    public void func() {
        System.out.println("数値を入力してください");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(scanner.hasNextInt()) {
                System.out.println("繰り返しを終了します" );
                break;
            }
            System.out.println("数値以外が入力されました");
            System.out.println("数値を入力してください");
            scanner.nextLine();
        }
    }
}
