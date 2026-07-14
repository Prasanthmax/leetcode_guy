// Last updated: 14/07/2026, 14:42:45
class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            arr[a]++;
        }
        int[] arr1 = new int[5];
        int[] indices = {0, 4, 8, 14, 20};
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            arr1[i] = arr[idx];
            arr[idx] = 0; 
        }
        int maxArr = 0;
        for (int val : arr) {
            if (val > maxArr) maxArr = val;
        }
        int maxArr1 = 0;
        for (int val : arr1) {
            if (val > maxArr1) maxArr1 = val;
        }
        return maxArr + maxArr1;
    }
}