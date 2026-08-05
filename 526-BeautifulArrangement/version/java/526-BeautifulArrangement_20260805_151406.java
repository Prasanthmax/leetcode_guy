// Last updated: 05/08/2026, 15:14:06
1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int inc=0;
4        int dec=0;
5        int temp1=1;
6        int temp2=1;
7        for(int i=0;i<nums.length-1;i++){
8            if(nums[i]<nums[i+1]){
9                temp1++;
10            }
11            else{
12                inc=Math.max(inc,temp1);
13                temp1=1;
14            }
15        }
16        for(int i=0;i<nums.length-1;i++){
17            if(nums[i]>nums[i+1]){
18                temp2++;
19            }
20            else{
21                dec=Math.max(dec,temp2);
22                temp2=1;
23            }
24        }
25        inc=Math.max(inc,temp1);
26        dec=Math.max(dec,temp2);
27        return dec>inc ? dec : inc;
28    }
29}