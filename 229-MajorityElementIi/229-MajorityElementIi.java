// Last updated: 14/07/2026, 14:48:08
class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int can1=0,can2=0;
       int count1=0,count2=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==can1){
            count1++;
        }
        else if(nums[i]==can2){
            count2++;
        }
        else if(count1==0){
            can1=nums[i];
            count1=1;
        }
        else if(count2==0){
            can2=nums[i];
            count2=1;
        }
        else{
            count1--;
            count2--;
        }
       }
       count1=0;
       count2=0;
       for(int i=0;i<nums.length;i++){
        if(can1==nums[i]) count1++;
        else if(can2==nums[i]) count2++;
       }
       List<Integer> list=new ArrayList<>();
       if(count1>nums.length/3) list.add(can1);
       if(count2>nums.length/3) list.add(can2);
       return list;
    } 
}
