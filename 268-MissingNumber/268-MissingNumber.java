// Last updated: 2/4/2026, 10:46:11 PM
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
}