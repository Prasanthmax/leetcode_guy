// Last updated: 14/07/2026, 14:47:02
class Solution {
	public boolean checkSubarraySum(int[] nums, int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,-1);
		int sum=0;
		int i=0;
		for(int num:nums) {
			sum+=num;
			int rem=(k!=0)?sum%k:sum;
			if(rem<0) rem+=k;
			if(map.containsKey(rem)) {
				if(i-map.get(rem)>=2) {
					return true;
				}
            }
				else {
					map.put(rem,i);
				}
            i++;
		}
		return false;
	}
}