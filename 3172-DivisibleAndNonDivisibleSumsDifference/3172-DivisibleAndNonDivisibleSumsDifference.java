// Last updated: 2/4/2026, 10:45:29 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int s1= 0;
        int s2 =0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                s1 +=i;
            }
            else continue;
        }
        for(int j=0;j<=n;j++){
            if(j%m!=0){
                s2 +=j;
            }
            else continue;
        }
        return s2-s1;
        
    }
}