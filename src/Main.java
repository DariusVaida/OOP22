import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Powers of 2");
        int count=0;
        BigInteger powerOfTwo= BigInteger.valueOf(1);
        BigInteger result;
        while(count<64)
        {
            System.out.println(powerOfTwo);
            result = powerOfTwo.multiply(BigInteger.valueOf(2));
            powerOfTwo = result;
            count++;
        }
    }
}