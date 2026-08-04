// Last updated: 04/08/2026, 12:11:09
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int[] arr=new int[s.length()];
4        for(int i=0;i<s.length();i++){
5            arr[i]=Integer.MAX_VALUE;
6        }
7        for(int i=s.length()-1;i>=0;i--){
8            if(s.charAt(i)!=c){
9                continue;
10            }
11            else{
12                for(int j=0;j<s.length();j++){
13                    arr[j]=Math.min(arr[j],Math.abs(i-j));
14                }
15            }
16        }
17        return arr;
18    }
19}