// Last updated: 12/08/2026, 21:26:02
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i:candyType){
5            if(!set.contains(i)){
6                set.add(i);
7            }
8        }
9        return set.size()<candyType.length/2 ? set.size() : candyType.length/2;
10    }
11}