// Last updated: 12/08/2026, 11:58:30
1class Solution {
2    public boolean isValid(String word) {
3        String s="AEIOUaeiou";
4        int vow=0;
5        int con=0;
6        int dig=0;
7        for(int i=0;i<word.length();i++){
8            char c=word.charAt(i);
9            if(Character.isDigit(c)){
10                dig++;
11            }
12            else if(s.indexOf(c)!=-1){
13                vow++;
14            }
15            else if(Character.isLetter(c)){
16                con++;
17            }
18            else{
19                return false;
20            }
21        }
22        if(vow>0 && con>0 && (vow+con+dig)>2){
23            return true;
24        }
25        return false;
26    }
27}