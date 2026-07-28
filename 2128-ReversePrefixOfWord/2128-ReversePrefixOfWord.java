// Last updated: 28/07/2026, 16:27:21
class Solution {
    public String reversePrefix(String word, char ch) {
        int n=0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                n=i;
                break;
            }
        }
        if(n==0) return word;
        StringBuilder sb=new StringBuilder();
        for(int i=n;i>=0;i--){
            sb.append(word.charAt(i));
        }
        for(int i=n+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}