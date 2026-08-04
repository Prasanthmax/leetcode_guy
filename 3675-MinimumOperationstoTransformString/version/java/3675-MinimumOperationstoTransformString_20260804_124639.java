// Last updated: 04/08/2026, 12:46:39
1class Solution {
2    public int minFlipsMonoIncr(String S) {
3	if(S == null || S.length() <= 0 )
4		return 0;
5
6	char[] sChars = S.toCharArray();
7	int flipCount = 0;
8	int onesCount = 0;
9
10	for(int i=0; i<sChars.length; i++){
11		if(sChars[i] == '0'){
12			if(onesCount == 0) continue;
13			else flipCount++;
14		}else{
15			onesCount++;
16		}
17		if(flipCount > onesCount){
18			flipCount = onesCount;
19		}
20	}
21	return flipCount;
22}
23}