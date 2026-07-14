// Last updated: 14/07/2026, 14:50:00
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger big1=new BigInteger(String.valueOf(num1));
        BigInteger big2=new BigInteger(String.valueOf(num2));
        return String.valueOf(big1.multiply(big2));
    }
}