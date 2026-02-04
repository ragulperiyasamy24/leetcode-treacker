// Last updated: 2/4/2026, 10:45:38 PM
class Solution {
    public int differenceOfSum(int[] num) {
        int digit=0;
        int sum=0;
        for(int i:num){
            sum=sum+i;
        }
        for(int c:num){
            while(c!=0){
                int d=c%10;
                c/=10;
                digit=digit+d; 
            }
        }
        return sum-digit;
        
    }
}