// Last updated: 14/07/2026, 14:43:07
class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a+b<=c || b+c<=a || a+c<=b){
            return "none";
        }
        if(a==b && a==c){
            return "equilateral";
        }
        if(a==b || a==c || b==c){
            return "isosceles";
        }
        if(a+b>c && a+c>b && b+c>a){
            return "scalene";
        }
        return "none";
    }
}