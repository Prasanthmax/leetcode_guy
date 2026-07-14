// Last updated: 14/07/2026, 14:50:04
class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int cur1=0;
        int cur2=0;
        int sum=0;
        for(int i=0;i<height.length;i++){
            cur1=Math.max(cur1,height[i]);
            left[i]=cur1;
        }
        for(int i=height.length-1;i>=0;i--){
            cur2=Math.max(cur2,height[i]);
            right[i]=cur2;
        }
        for(int i=0;i<height.length;i++){
            int temp=Math.min(left[i],right[i])-height[i];
            if(temp>0){
                sum+=temp;
            }
        }
        return sum;
    }
}