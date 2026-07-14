// Last updated: 14/07/2026, 14:47:13
class Solution {  
    public boolean find132pattern(int[] nums) {  
        if (nums.length < 3) return false;  
        Stack<Integer> stack = new Stack<>();  
        int third = Integer.MIN_VALUE; 
        for (int j = nums.length - 1; j >= 0; j--) {  
            if (nums[j] < third) {  
                return true; 
            }  
            while (!stack.isEmpty() && nums[j] > stack.peek()) {  
                third = stack.pop();
            }  
            stack.push(nums[j]);
        }  
        return false;  
    }  
}  