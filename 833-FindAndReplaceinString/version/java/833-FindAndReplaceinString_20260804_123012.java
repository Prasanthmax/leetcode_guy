// Last updated: 04/08/2026, 12:30:12
1class Solution {
2    public int minOperations(String s) {
3        char[] arr=s.toCharArray();
4        Arrays.sort(arr);
5        char c=arr[0];
6        int i=0;
7        if(arr[arr.length-1]=='a') return 0;
8        while(c=='a'){
9            c=arr[i++];
10        }
11        int sum='z'-c;
12        return sum+1;
13    }
14}