// Last updated: 2/4/2026, 10:45:22 PM
class Solution {
    public int findClosest(int x, int y, int z) { 
        int f=Math.abs(z-x);
        int s=Math.abs(z-y);
        if(f==s) return 0;
        return f<s ? 1:2;



        
    }
}