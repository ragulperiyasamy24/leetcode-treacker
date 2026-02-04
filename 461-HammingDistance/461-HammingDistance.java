// Last updated: 2/4/2026, 10:46:04 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
       int count=0;
       while(xor!=0){
        xor = xor & (xor -1);
        count++;
       }
return count;
    }
}