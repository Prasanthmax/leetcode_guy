// Last updated: 14/07/2026, 14:49:44
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int carry=0;
        int l1=a.length()-1;
        int l2=b.length()-1;
        while(l1>=0 || l2>=0 || carry==1){
            int total=carry;
            if(l1>=0){
                total+=a.charAt(l1--)-'0';
            }
            if(l2>=0){
                total+=b.charAt(l2--)-'0';
            }
            res.append(total%2);
            carry=total/2;
        }
        return res.reverse().toString();
    }
}