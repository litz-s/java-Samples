import java.math.BigDecimal;
import java.math.BigInteger;

public class SampleBigNum1 {
    public void  func () {
        String strNum1 = "12345123451234512345";
        BigInteger bigInt1 = new BigInteger(strNum1);
        BigInteger bigInt2 = BigInteger.valueOf(9999);
        System.out.println("bigInt1 = " + bigInt1.toString());
        System.out.println("bigInt2 = " + bigInt2.toString());
        String strNum2 = "12340.123401234012345";
        BigDecimal bigDic1 = new BigDecimal(strNum2);
        BigDecimal bigDic2 = BigDecimal.valueOf(99.99);
        System.out.println("bigDic1 = " + bigDic1.toString());
        System.out.println("bigDic2 = " + bigDic2.toString());
    }
}
