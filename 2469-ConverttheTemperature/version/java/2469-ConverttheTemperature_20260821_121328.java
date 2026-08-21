// Last updated: 21/08/2026, 12:13:28
1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double[] arr=new double[2];
4        arr[0]=celsius+273.15;
5        arr[1]=celsius*1.80+32.00;
6        return arr;
7    }
8}