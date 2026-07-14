// Last updated: 14/07/2026, 14:43:21
import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        List<String> list=new ArrayList<>();
        String s = Pattern.quote(String.valueOf(sep));
        for(String word:words){
            String[] arr=word.split(s);
            for(String a:arr){
              if(!a.isEmpty()){
                list.add(a);
              }
            }
        }
        return list;
    }
}