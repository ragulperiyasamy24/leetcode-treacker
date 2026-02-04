// Last updated: 2/4/2026, 10:46:23 PM
class Solution {
    public int singleNumber(int[] nums) {
       int a=0;
       for(int i=0;i<nums.length;i++){
        a^=nums[i];
       } 
       return  a;
    }
}