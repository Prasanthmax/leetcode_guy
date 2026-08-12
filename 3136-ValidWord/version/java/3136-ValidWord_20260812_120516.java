// Last updated: 12/08/2026, 12:05:16
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int[] arr=new int[10];
4        while(n!=0){
5            int temp=n%10;
6            arr[temp]++;
7            n/=10;
8        }
9        int sum=0;
10        for(int i=0;i<arr.length;i++){
11            sum+=arr[i]*i;
12        }
13        return sum;
14    }
15}