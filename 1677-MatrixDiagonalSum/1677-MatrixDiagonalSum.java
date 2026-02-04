// Last updated: 2/4/2026, 10:45:46 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if( i!=mat.length-1-i){
            sum+=mat[i][mat.length-i-1];
        }
    }
          return sum;
    }
}



