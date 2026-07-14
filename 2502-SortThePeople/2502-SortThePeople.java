// Last updated: 14/07/2026, 14:43:48
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        if(names.length<=1){
            return names;
        }
        int[] stk=new int[names.length];
        int low=0;
        int high=names.length-1;
        int top=-1;
        stk[++top]=low;
        stk[++top]=high;
        while(top>=0){
            high=stk[top--];
            low=stk[top--];
            int pivot=heights[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(heights[j]>=pivot){
                    i++;
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String temp1=names[i];
                    names[i]=names[j];
                    names[j]=temp1;
                }
            }
            int temp2=heights[i+1];
            heights[i+1]=heights[high];
            heights[high]=temp2;
            String temp3=names[i+1];
            names[i+1]=names[high];
            names[high]=temp3;
            int p=i+1;
            if(p-1>low){
                stk[++top]=low;
                stk[++top]=p-1;
            }
            if(p+1<high){
                stk[++top]=p+1;
                stk[++top]=high;
            }
        }
        return names;
    }
}