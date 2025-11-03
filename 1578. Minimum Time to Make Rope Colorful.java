//TC=O(n) SC=O(1)

class Solution {
    public int minCost(String colors, int[] neededTime) {
         int time=0;
         int prev=0;
         int n=colors.length();

         for(int i=0;i<n;i++){
            int curr=neededTime[i];
            if(i>0 && colors.charAt(i)!=colors.charAt(i-1))
            {
                prev=0;
            }
            time+=Math.min(prev,curr);//greedily
            prev=Math.max(prev,curr);
         } 
         return time;
    }
}
