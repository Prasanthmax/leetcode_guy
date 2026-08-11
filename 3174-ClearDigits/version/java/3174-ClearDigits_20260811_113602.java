// Last updated: 11/08/2026, 11:36:02
1class Solution {
2    public String clearDigits(String s) {
3        StringBuilder sb=new StringBuilder();
4        Stack<Character> stk=new Stack<>();
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(Character.isLetter(c)){
8                stk.push(c);
9            }
10            else{
11                stk.pop();
12            }
13        }
14        while(!stk.isEmpty()){
15            sb.append(stk.pop());
16        }
17        return sb.reverse().toString();
18    }
19}