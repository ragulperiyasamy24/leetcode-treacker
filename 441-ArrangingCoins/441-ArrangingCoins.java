// Last updated: 2/4/2026, 10:46:05 PM
class Solution {
    public int arrangeCoins(int n) {
     int row=1;
    while(n>=row){
        n-=row;
        row++;
    }
    return row-1;

    }
}