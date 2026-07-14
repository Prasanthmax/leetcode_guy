// Last updated: 14/07/2026, 14:42:49
class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num1<100 && num2<100) return 0;
        int wave=0;
        for(int i=num1;i<=num2;i++){
            String s=String.valueOf(i);
            for(int j=1;j<s.length()-1;j++){
                if((s.charAt(j)>s.charAt(j-1)) && (s.charAt(j)>s.charAt(j+1))){
                    wave++;
                }
                if((s.charAt(j)<s.charAt(j-1)) && (s.charAt(j)<s.charAt(j+1))){
                    wave++;
                }
            }
        }
        return wave;
    }
}