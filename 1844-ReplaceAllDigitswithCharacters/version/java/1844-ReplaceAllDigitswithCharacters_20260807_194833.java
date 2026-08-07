// Last updated: 07/08/2026, 19:48:33
1class Solution {
2    public String replaceDigits(String s) {
3        StringBuilder sb=new StringBuilder();
4        sb.append(s.charAt(0));
5        for(int i=1;i<s.length();i++){
6            if(i%2==0){
7                sb.append(s.charAt(i));
8            }
9            else{
10                int c=s.charAt(i)-'0';
11                sb.append((char)(s.charAt(i-1)+c));
12            }
13        }
14        return sb.toString();
15    }
16}