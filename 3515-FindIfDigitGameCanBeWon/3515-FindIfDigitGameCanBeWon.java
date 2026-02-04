// Last updated: 2/4/2026, 10:45:20 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
      int singleDigit=0;
      int doubleDigit=0;
      for(int x:nums){
        if(x<10) singleDigit+=x;
        else doubleDigit+=x;
      }
      return singleDigit!=doubleDigit;
      }
}