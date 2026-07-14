// Last updated: 14/07/2026, 14:47:15
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int a=0;
        Arrays.sort(g);Arrays.sort(s);
        for(int i=0;a<g.length && i<s.length;i++){
            if(g[a]<=s[i]) a++;
        }
        return a;
    }
}