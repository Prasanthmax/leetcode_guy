// Last updated: 31/07/2026, 11:53:12
1class Solution {
2    public int minimumPushes(String word) {
3        int[] arr=new int[26];
4        for(int i=0;i<word.length();i++){
5            int c=word.charAt(i)-'a';
6            arr[c]++;
7        }
8        Arrays.sort(arr);
9        int count=0;
10        int temp=0;
11        for(int i=arr.length-1;i>=0;i--){
12            if(temp<8){
13                count+=arr[i]*1;
14                temp++;
15            }
16            else if(temp<16){
17                count+=arr[i]*2;
18                temp++;
19            }
20            else if(temp<24){
21                count+=arr[i]*3;
22                temp++;
23            }
24            else{
25                count+=arr[i]*4;
26            }
27        }
28        return count;
29    }
30}