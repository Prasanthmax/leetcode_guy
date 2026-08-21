// Last updated: 21/08/2026, 12:17:53
1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        List<Integer> list=new ArrayList<>();
4        for(int i=0;i<words.length;i++){
5            if(words[i].indexOf(x)!=-1){
6                list.add(i);
7            }
8        }
9        return list;
10    }
11}