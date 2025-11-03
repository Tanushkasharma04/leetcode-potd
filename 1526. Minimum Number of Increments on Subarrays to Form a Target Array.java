
//tc=o(n) sc=o(1)

class Solution {
    public int minNumberOperations(int[] target) {
         int result=0;
        int n=target.length;

        int curr=0;
        int prev=0;
        for(int i=0;i<n;i++){
            curr=target[i];
        
        
         if(Math.abs(curr)>Math.abs(prev)){
            result+=Math.abs(curr)-Math.abs(prev);
        }
         prev=curr;
        }

        return result;
    }
    }
