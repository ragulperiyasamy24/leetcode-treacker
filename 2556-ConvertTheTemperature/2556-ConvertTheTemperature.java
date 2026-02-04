// Last updated: 2/4/2026, 10:45:42 PM
class Solution {
    public double[] convertTemperature(double C) {
        double [] d=new double[2];
        d[0]=C+273.15;
        d[1]=C*1.80+32.00;
        return d;
        
    }
}