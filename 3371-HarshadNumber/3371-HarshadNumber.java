// Last updated: 2/4/2026, 10:45:27 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
     int sum =0;
     int n=x;
    while(n>0){
        sum=sum+n%10;
        n=n/10;
    }
    if(x%sum==0){
        return sum;
    } 
    else return n-1; 
    }
}