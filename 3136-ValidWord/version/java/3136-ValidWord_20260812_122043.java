// Last updated: 12/08/2026, 12:20:43
1class Solution {
2    public int maxDifference(String s) {
3        int[] arr=new int[26];
4        for(int i=0;i<s.length();i++){
5            char c=s.charAt(i);
6            arr[c-'a']++;
7        }
8        int min=Integer.MAX_VALUE;
9        int max=0;
10        for(int i=0;i<arr.length;i++){
11            if(arr[i]!=0){
12                if(arr[i]%2==0){
13                    min=Math.min(min,arr[i]);
14                }
15                else{
16                    max=Math.max(max,arr[i]);
17                }
18            }
19        }
20        return max-min;
21    }
22}