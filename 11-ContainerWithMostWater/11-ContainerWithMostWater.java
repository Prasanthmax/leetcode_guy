// Last updated: 14/07/2026, 14:50:37
class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int temp=Math.min(height[left],height[right]);
            area=Math.max(area,temp*(right-left));
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return area;
    }
}