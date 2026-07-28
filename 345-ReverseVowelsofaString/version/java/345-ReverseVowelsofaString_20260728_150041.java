// Last updated: 28/07/2026, 15:00:41
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr=s.toCharArray();
4        String vow="AEIOUaeiou";
5        int left=0;
6        int right=arr.length-1;
7        while(left<right){
8            while(left<right && vow.indexOf(arr[left])==-1){
9                left++;
10            }
11            while(left<right && vow.indexOf(arr[right])==-1){
12                right--;
13            }
14            char temp=arr[left];
15            arr[left]=arr[right];
16            arr[right]=temp;
17            left++;
18            right--;
19        }
20        return new String(arr);
21    }
22}