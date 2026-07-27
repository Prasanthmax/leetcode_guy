// Last updated: 27/07/2026, 12:15:41
class Solution {
    public long countVowels(String word) {
        long total=0;
        long n=word.length();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                total+=(long)(i+1)*(n-i);
            }
        }
        return total;
    }
}