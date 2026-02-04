// Last updated: 2/4/2026, 10:45:49 PM
class Solution {
    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int friend:guestList)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }
        
        
        return ans;
    }
}