import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SamplePatter2 {
    public void func() {
        Pattern pat1 = Pattern.compile("[ぁ-ん]+");
        Matcher mat1 = pat1.matcher("ありがとう");
        System.out.println(mat1.matches());
        Pattern pat2 = Pattern.compile("[ァ-ヶ]{1,5}");
        Matcher mat2 = pat2.matcher("アリガトウ");
        System.out.println(mat2.matches());
        Pattern pat3 = Pattern.compile("[^0-9]+");
        Matcher mat3 = pat3.matcher("123456789");
        System.out.println(mat3.find());
    }
}