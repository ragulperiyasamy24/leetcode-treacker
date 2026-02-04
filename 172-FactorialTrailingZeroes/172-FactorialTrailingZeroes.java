// Last updated: 2/4/2026, 10:46:21 PM
class Solution {
    public int trailingZeroes(int n) {
        int res=0;
        while(n>0){
            n=n/5;
            res+=n;
        }
        return res;
        
    }
}