// Last updated: 2/4/2026, 10:46:01 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int g=num;
       for(int i=1;i<=num/2;i++){
         if(g%i==0){
            sum=sum+i;
         }
         else continue;
       }
       if (sum==g) return true;
       else return false;
    }
}