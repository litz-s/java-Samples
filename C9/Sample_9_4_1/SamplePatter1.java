import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SamplePatter1 {
    public void func() {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher("08012345678Yamada");
        if (matcher.find()) {
            System.out.println("一部分マッチしました");
        } else {
            System.out.println("マッチする部分はありません");
        }
        if (matcher.matches()) {
            System.out.println("マッチしました");
        } else {
            System.out.println("マッチしません");
        }
        if (matcher.lookingAt()) {
            System.out.println("先頭がマッチしました");
        } else {
            System.out.println("先頭はマッチしません");
        }
    }
}