// Last updated: 28/07/2026, 15:59:32
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int count=0;
4        boolean res=false;
5        for(int i=0;i<word.length();i++){
6            char c=word.charAt(i);
7            if((i==0) && (Character.isUpperCase(c))){
8                res=true;
9            }
10            if(Character.isUpperCase(c)){
11                count++;
12            }
13        }
14        if(count==word.length() || count==0 || (res && count==1)){
15            return true;
16        }
17        return false;
18    }
19}