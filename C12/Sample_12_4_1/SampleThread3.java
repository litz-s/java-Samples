import java.util.Scanner;

public class SampleThread3 extends Thread {
    public SampleThread3(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("入力を受け付けました：" + str);
    }
}