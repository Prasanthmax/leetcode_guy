// Last updated: 10/08/2026, 13:43:13
1class Solution {
2    public String modifyString(String s) {
3        int[] arr=new int[26];
4        for(int i=0;i<s.length();i++){
5            char c=s.charAt(i);
6            if(c!='?'){
7                arr[c-'a']++;
8            }
9        }
10        StringBuilder sb=new StringBuilder();
11        for(int i=0;i<s.length();i++){
12            char c=s.charAt(i);
13            if(c!='?'){
14                sb.append(c);
15            }
16            else{
17                int min=Integer.MAX_VALUE;
18                int index=-1;
19                for(int j=0;j<arr.length;j++){
20                    if(i>0 && j==sb.charAt(sb.length()-1)-'a'){
21                        continue;
22                    }
23                    if(min>arr[j]){
24                        min=arr[j];
25                        index=j;
26                    }
27                }
28                sb.append((char)('a'+index));
29                arr[index]++;
30            }
31        }
32        return sb.toString();
33    }
34}