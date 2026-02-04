// Last updated: 2/4/2026, 10:45:52 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int i=0;
        int j=0;
        for(int n:position){
            if(n%2==0){
            i++;
        }
        else j++;
       }
       return i<j?i:j;
}
}