// Last updated: 2/4/2026, 10:45:41 PM
class Solution {
    public int countDigits(int num) {
        if(num<10) return 1;
        int original =num;
        int count=0;
    while(num!=0){
        int L=num%10;
        num=num/10;
        if(original%L==0){
            count++;

        }
        else continue;
    }
    return count;
    }
}