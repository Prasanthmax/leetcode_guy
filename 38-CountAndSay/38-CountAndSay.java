// Last updated: 14/07/2026, 14:50:05
class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=2;i<=n;i++){
            result=rec(result);
        }
        return result;
    }
    public String rec(String s){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(s.charAt(i));
                count=1;
            }
        }
        return sb.toString();
    }
}