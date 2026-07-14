// Last updated: 14/07/2026, 14:43:36
class Solution {
    public int alternateDigitSum(int n) {
        String str=n+"";
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                arr[i]=arr[i]*-1;
            }
            sum+=arr[i];
        }
        return sum;
    }
}