// Last updated: 14/07/2026, 14:47:48
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] a=pattern.toCharArray();
        String[] b=s.split(" ");
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    if(!b[i].equals(b[j])){
                        return false;
                    }
                }
                if(b[i].equals(b[j])){
                    if(a[i]!=a[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}