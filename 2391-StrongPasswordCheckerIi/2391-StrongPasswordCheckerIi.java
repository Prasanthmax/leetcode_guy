// Last updated: 14/07/2026, 14:43:57
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lower=false,upper=false,digit=false,spl=false;
        String spc="!@#$%^&*()-+";
        int n=password.length();
        if(n<8){
            return false;
        }
        for(char num:password.toCharArray()){
            if(Character.isLowerCase(num)){
                lower=true;
            }
            if(Character.isUpperCase(num)){
                upper=true;
            }
            if(Character.isDigit(num)){
                digit=true;
            }
            if(spc.contains(String.valueOf(num))){
                spl = true;
            }
        }
        char[] pass=password.toCharArray();
        for(int i=0;i<password.length()-1;i++){
            if(pass[i]==pass[i+1]){
                return false;
            }
        }
        return lower && upper && digit && spl;
    }
}