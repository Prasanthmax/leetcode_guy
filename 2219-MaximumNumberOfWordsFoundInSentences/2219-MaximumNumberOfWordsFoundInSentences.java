// Last updated: 14/07/2026, 14:44:14
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            int temp=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    temp++;
                }
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}