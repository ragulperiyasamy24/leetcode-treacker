// Last updated: 2/4/2026, 10:45:45 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int num:nums)
            if (num%6==0) {
                sum += num;
                count++;
            }
       return count == 0 ? 0 : sum/count;
    }
}