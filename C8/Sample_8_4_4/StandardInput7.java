import java.util.Scanner;

public class StandardInput7 {
    public void printSub() throws NumberFormatException, MyException {
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
    public void printGrade() throws NumberFormatException, MyException {
        System.out.println("1～3の数値を入力してください");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = Integer.parseInt(str);
        if (index < 1 || index > 3) {
            throw new MyException("1～3以外の数値が入力されました");
        }
        System.out.println(index + "年生");
    }
}