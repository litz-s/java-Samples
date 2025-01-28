import java.math.BigInteger;

public class Calculate1 {
    public void func() {
        BigInteger bigInt = BigInteger.valueOf(100);
        System.out.println(bigInt.add(BigInteger.valueOf(100)));
        System.out.println(bigInt.subtract(BigInteger.valueOf(10)));
        System.out.println(bigInt.multiply(BigInteger.valueOf(100)));
        System.out.println(bigInt.divide(BigInteger.valueOf(30)));
        System.out.println(bigInt.mod(BigInteger.valueOf(30)));
    }
}