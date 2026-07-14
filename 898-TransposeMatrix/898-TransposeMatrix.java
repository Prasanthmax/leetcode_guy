// Last updated: 14/07/2026, 14:46:28
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] arr=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             arr[j][i]=matrix[i][j];   
            }
        }
        return arr;
    }
}