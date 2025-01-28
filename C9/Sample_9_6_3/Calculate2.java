import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculate2 {
    public void func() {
        BigDecimal bidDec1 = BigDecimal.valueOf(10);
        BigDecimal bidDec2 = BigDecimal.valueOf(6);
        BigDecimal result1 = bidDec1.divide(bidDec2, 2, RoundingMode.DOWN);
        System.out.println(result1);
        BigDecimal bidDec3 = BigDecimal.valueOf(123.456789);
        BigDecimal result2 = bidDec3.setScale(3, RoundingMode.HALF_UP);
        System.out.println(result2);
    }
}