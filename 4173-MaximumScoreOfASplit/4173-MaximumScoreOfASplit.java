// Last updated: 2/4/2026, 10:45:25 PM
class Solution{
public long maximumScore(int[]nums){
int n=nums.length;
int[]s=new int[n];
s[n-1]=nums[n-1];
for(int i=n-2;i>=0;i--)s[i]=Math.min(nums[i],s[i+1]);
long pre=0,ans=Long.MIN_VALUE;
for(int i=0;i<n-1;i++){
pre+=nums[i];
ans=Math.max(ans,pre-s[i+1]);
}
return ans;
}
}
