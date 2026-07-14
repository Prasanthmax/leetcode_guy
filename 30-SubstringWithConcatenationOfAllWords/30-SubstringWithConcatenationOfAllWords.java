// Last updated: 14/07/2026, 14:50:13
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list=new ArrayList<>();
        int word=words.length;
        int wordlen=words[0].length();
        int sublen=word*wordlen;
        Map<String,Integer> wordmap=new HashMap<>();
        for(String a:words){
            wordmap.put(a,wordmap.getOrDefault(a,0)+1);
        }
        if(sublen>s.length()) return list;
        for(int i=0;i<wordlen;i++){
            int left=i;
            int right=i;
            int wordfound=0;
            Map<String,Integer> extramap=new HashMap<>(); 
            while(right+wordlen<=s.length()){
                String curr=s.substring(right,right+wordlen);
                right+=wordlen;
                if(wordmap.containsKey(curr)){
                    extramap.put(curr,extramap.getOrDefault(curr,0)+1);
                    wordfound++;
                    while(wordmap.get(curr)<extramap.get(curr)){
                        String sss=s.substring(left,wordlen+left);
                        extramap.put(sss,extramap.get(sss)-1);
                        wordfound--;
                        left+=wordlen;
                    }
                    if(wordfound==word){
                        list.add(left);
                    }
                }
                else{
                    extramap.clear();
                    wordfound=0;
                    left=right;
                }
            }
        }
        return list;
    }
}