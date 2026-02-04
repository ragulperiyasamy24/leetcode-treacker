// Last updated: 2/4/2026, 10:45:30 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return (purchaseAmount%10<=4)?100-(purchaseAmount/10)*10:100-(purchaseAmount/10+1)*10;
    }
}