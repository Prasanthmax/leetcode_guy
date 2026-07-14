// Last updated: 14/07/2026, 14:44:12
class Solution {
    public boolean isSameAfterReversals(int num) {
       String str=num+"";
       int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        if(num==0) return true;
        if(arr[0]==0 || arr[arr.length-1]==0){
            return false;
        }
        return true;
    }
}