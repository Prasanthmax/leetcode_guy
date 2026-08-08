// Last updated: 08/08/2026, 14:54:38
1class Solution {
2    public int minElement(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int temp=0;
5            while(nums[i]!=0){
6                int res=nums[i]%10;
7                temp+=res;
8                nums[i]/=10;
9            }
10            nums[i]=temp;
11        }
12        Arrays.sort(nums);
13        return nums[0];
14    }
15}