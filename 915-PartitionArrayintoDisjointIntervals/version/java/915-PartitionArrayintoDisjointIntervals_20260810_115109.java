// Last updated: 10/08/2026, 11:51:09
1class Solution {
2    public boolean checkString(String s) {
3        char[] arr=s.toCharArray();
4        for(int i=0;i<arr.length-1;i++){
5            if(arr[i]=='b' && arr[i+1]=='a'){
6                return false;
7            }
8        }
9        return true;
10    }
11}