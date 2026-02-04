// Last updated: 2/4/2026, 10:45:55 PM
class Solution {
    public int fib(int n) {
     if(n==0||n==1) return n;
     int p1=0,p2=1,next=0;
     for(int i =1;i<n;i++){
        next=p1+p2;
        p1=p2;
        p2=next;
     }
      return next;
    }
}