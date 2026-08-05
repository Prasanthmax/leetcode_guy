// Last updated: 05/08/2026, 15:03:39
1class Solution {
2    public int[] findThePrefixCommonArray(int[] a, int[] b) {
3        int count=0;
4        int[] arr=new int[a.length];
5        Set<Integer> set=new HashSet<>();
6        int k=0;
7        for(int i=0;i<a.length;i++){
8            set.add(a[i]);
9            for(int j=0;j<=i;j++){
10                if(set.contains(b[j])){
11                    arr[k]++;
12                }
13            }
14            k++;
15        }
16        return arr;
17    }
18}