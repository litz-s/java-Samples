import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SamplePatter3 {
    public void func() {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher("Yamada Taro");
        System.out.println(matcher.replaceAll(""));
        Pattern pattern2 = Pattern.compile("[^0-9]+");
        Matcher matcher2 = pattern2.matcher("Yamada08012345678#+-");
        System.out.println(matcher2.replaceAll("")); 
        System.out.println(matcher2.replaceFirst(""));
    }
}