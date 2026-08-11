// Last updated: 11/08/2026, 11:57:03
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int ver=0;
4        int hor=0;
5        for(char c:moves.toCharArray()){
6            if(c=='U'){
7                ver++;
8            }
9            else if(c=='D'){
10                ver--;
11            }
12            else if(c=='L'){
13                hor++;
14            }
15            else{
16                hor--;
17            }
18        }
19        if(ver==0 && hor==0){
20            return true;
21        }
22        return false;
23    }
24}