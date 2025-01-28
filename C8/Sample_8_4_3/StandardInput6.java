import java.util.Scanner;

public class StandardInput6 {
    public void printSub() throws MyException {
        String[] sub = {"国語", "数学", "英語", "理科", "社会"};
        System.out.println("0～4の数値を入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = Integer.parseInt(str);
        if (index < 0 || index > 4) {
            throw new MyException("0～4以外の数値が入力されました");
        }
        System.out.println(sub[index]);
    }
}