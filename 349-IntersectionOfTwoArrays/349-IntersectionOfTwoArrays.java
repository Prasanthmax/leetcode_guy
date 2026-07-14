// Last updated: 14/07/2026, 14:47:36
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                res.add(i);
            }
        }
        int[] arr=new int[res.size()];
        int j=0;
        for(int i:res){
            arr[j++]=i;
        }
        return arr;
    }
}