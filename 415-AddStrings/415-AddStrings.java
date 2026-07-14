// Last updated: 14/07/2026, 14:47:21
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger num3=new BigInteger(num1);
        BigInteger num4=new BigInteger(num2);
        BigInteger num5=num3.add(num4);
        return num5+"";
    }
}