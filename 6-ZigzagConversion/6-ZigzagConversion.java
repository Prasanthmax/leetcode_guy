// Last updated: 14/07/2026, 14:50:41
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] arr=new StringBuilder[numRows];
        boolean updown=false;
        for(int i=0;i<numRows;i++){
            arr[i]=new StringBuilder();
        }
        int curr=0;
        for(int i=0;i<s.length();i++){
            arr[curr].append(s.charAt(i));
            if(curr==0 || curr==numRows-1){
                updown=!updown;
            }
            if(updown){
                curr++;
            }
            else{
                curr--;
            }
        }
        StringBuilder ss=new StringBuilder();
        for(StringBuilder a:arr){
            ss.append(a);
        }
        return ss.toString();
    }
}