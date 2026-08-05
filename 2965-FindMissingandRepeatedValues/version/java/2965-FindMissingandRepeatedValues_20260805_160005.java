// Last updated: 05/08/2026, 16:00:05
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        Set<Integer> set=new HashSet<>();
4        int[] arr=new int[2];
5        for(int i=0;i<grid.length;i++){
6            for(int j=0;j<grid.length;j++){
7                if(!set.contains(grid[i][j])){
8                    set.add(grid[i][j]);
9                }
10                else{
11                    arr[0]=grid[i][j];
12                }
13            }
14        }
15        for(int i=1;i<=grid.length*grid.length;i++){
16            if(!set.contains(i)){
17                arr[1]=i;
18            }
19        }
20        return arr;
21    }
22}