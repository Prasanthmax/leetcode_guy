// Last updated: 14/07/2026, 14:47:18
class Solution {
    public List<Integer> findAnagrams(String str, String anagram) {
        ArrayList<Integer> list=new ArrayList<>();
		int n=anagram.length();
		for(int i=0; i<=str.length()-n; i++) {
		    boolean x=ianagram(i,i+n,str,anagram);
		    if(x==true) list.add(i);
			}
			return list;
		}
		static boolean ianagram(int start,int end,String str,String anagram){
		    int[] arr=new int[26];
		    for(int i=0;i<anagram.length();i++){
		        arr[anagram.charAt(i)-'a']++;
		    }
		    for(int i=start;i<end;i++){
		        arr[str.charAt(i)-'a']--;
		    }
		    for(int i=0;i<26;i++){
		        if(arr[i]!=0) return false;
		    }
		    return true;
		}
    }