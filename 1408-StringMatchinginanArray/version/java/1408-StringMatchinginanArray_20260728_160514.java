// Last updated: 28/07/2026, 16:05:14
1class Solution {
2    public List<String> stringMatching(String[] words) {
3        List<String> list=new ArrayList<>();
4        for(int i=0;i<words.length;i++){
5            for(int j=0;j<words.length;j++){
6                if(i!=j && words[i].contains(words[j])){
7                    if(!list.contains(words[j])){
8                        list.add(words[j]);
9                    }
10                }
11            }
12        }
13        return list;
14    }
15}