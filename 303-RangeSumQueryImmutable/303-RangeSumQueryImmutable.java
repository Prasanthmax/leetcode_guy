// Last updated: 14/07/2026, 14:47:45
class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
    this.prefix=nums;
    }
    public int sumRange(int left, int right) {
        if(left==0){
            return prefix[right];
        }
        return prefix[right]-prefix[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */