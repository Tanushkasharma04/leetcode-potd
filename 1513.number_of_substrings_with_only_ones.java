class Solution1 {
    public int numSub(String s) {
        long count=0;
        
        long ans=0;
        long mod=1_000_000_007;
        for(char ch : s.toCharArray()){
            if(ch=='1'){
                count++;
            }else{
                ans=(ans + count * (count+1)/2) % mod;
                count=0;
            }             
        }
        ans=(ans + count * (count+1)/2) % mod;
        
        return (int) ans;
    }
}

class Solution2 {
    public int numSub(String s) {
        int count=0;
        int result=0;
        int mod = 1_000_000_007;
        for(char ch : s.toCharArray()){
            if(ch =='1'){
                count++;
                result=(result+count)%mod;
            }else{
                count=0;
            }             
        }
        return result;
    }
}
