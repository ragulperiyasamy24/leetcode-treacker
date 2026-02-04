// Last updated: 2/4/2026, 10:45:31 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
     int count=0;
     for(int h  : hours){
        if(h>=target){
            count++;
        }
     }   
     return count;
    }
}