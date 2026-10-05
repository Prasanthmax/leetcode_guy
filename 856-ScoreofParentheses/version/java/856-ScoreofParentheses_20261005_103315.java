// Last updated: 05/10/2026, 10:33:15
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int score=0, depth=0;
4        for(int i=0;i<s.length();++i){
5            char c=s.charAt(i);
6            if(c=='('){
7                depth++;
8            }
9            else{
10                depth--;
11                if(s.charAt(i-1)=='('){
12                    score+=1 << depth;
13                }
14            }
15        }
16        return score;
17    }
18}