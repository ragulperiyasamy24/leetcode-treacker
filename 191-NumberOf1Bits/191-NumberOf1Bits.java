// Last updated: 2/4/2026, 10:46:18 PM
class Solution {
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0){
        if((n&1)==1)
            count++;
            n>>=1;

        }
        return count;
        
    }
}