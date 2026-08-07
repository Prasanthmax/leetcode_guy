// Last updated: 07/08/2026, 13:38:39
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        Map<Integer,Integer> map=new HashMap<>();
4        Set<Integer> set=new HashSet<>();
5        for(int i:arr2){
6            set.add(i);
7        }
8        int c=0;
9        for(int i:arr1){
10            if(set.contains(i)){
11                map.put(i,map.getOrDefault(i,0)+1);
12            }
13            else{
14                c++;
15            }
16        }
17        int[] arr=new int[c];
18        int[] arr3=new int[arr1.length];
19        int j=0;
20        int k=0;
21        for(int i=0;i<arr2.length;i++){
22            int a=0;
23            while(a<map.get(arr2[i])){
24                arr3[k++]=arr2[i];
25                a++;
26            }
27        }
28        for(int i=0;i<arr1.length;i++){
29            if(!set.contains(arr1[i])){
30                arr[j++]=arr1[i];
31            }
32        }
33        Arrays.sort(arr);
34        for(int i=0;i<arr.length;i++){
35            arr3[k++]=arr[i];
36        }
37        return arr3;
38    }
39}