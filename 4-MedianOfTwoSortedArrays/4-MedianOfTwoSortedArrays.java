// Last updated: 14/07/2026, 14:50:43
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int len1=nums1.length;
           int len2=nums2.length;
           int[] temp=new int[(len1+len2)];
           for(int i=0;i<len1;i++){
            temp[i]=nums1[i];
           }
           for(int i=0;i<len2;i++){
            temp[len1+i]=nums2[i];
           }
           Arrays.sort(temp);
           int len3=temp.length;
           
           if(len3>0){
           if(len3%2==0){
                double md=(temp[len3/2]+temp[(len3/2)-1])/2.00000;
                return md;
           }
           else{
            double med=temp[len3/2];
            return med;
           }
           }
           else{
            return temp[0];
           }
    }
}