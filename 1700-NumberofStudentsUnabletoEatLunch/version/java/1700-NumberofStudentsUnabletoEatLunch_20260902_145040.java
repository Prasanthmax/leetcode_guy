// Last updated: 02/09/2026, 14:50:40
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        int count=0;
4        int n=students.length;
5        for(int i=0;i<n;i++){
6            boolean res=true;
7            for(int j=0;j<n;j++){
8                if(sandwiches[i]==students[j]){
9                    sandwiches[i]=-1;
10                    students[j]=-1;
11                    res=false;
12                    break;
13                }
14            }
15            if(res){
16                break;
17            }
18        }
19        for(int i=0;i<n;i++){
20            System.out.print(students[i]+" ");
21            if(students[i]==0 || students[i]==1){
22                count++;
23            }
24        }
25        return count;
26    }
27}