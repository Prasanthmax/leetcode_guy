// Last updated: 14/07/2026, 14:49:42
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<words.length){
            int j=i+1;
            int linelength=words[i].length();
            while(j<words.length && linelength+words[j].length()+(j-i)<=maxWidth){
                linelength+=words[j].length();
                j++;
            }
            StringBuilder sb=new StringBuilder();
            int word=j-i;
            int gaps=word-1;
            if(j==words.length || gaps==0){
                for(int k=i;k<j;k++){
                    sb.append(words[k]);
                    if(k<j-1) sb.append(" ");
                }
                while(sb.length()<maxWidth){
                    sb.append(" ");
                }
            }
            else{
                int length=maxWidth-linelength;
                int base=length/gaps;
                int extra=length%gaps;
                for(int k=i;k<j;k++){
                    sb.append(words[k]);
                    if(k<j-1){
                        for(int s=0;s<base;s++){
                            sb.append(" ");
                        }
                        if(extra>0){
                            sb.append(" ");
                            extra--;
                        }
                    }
                }
            }
            list.add(sb.toString());
            i=j;
        }
        return list;
    }
}