class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean  found=true;
        while(found){
            found=false;//assume that the number is not found

            for(int num:nums){
                if(num==original){
                    original*=2;
                    found=true;
                    break;
                }
            }
        }
        return original;
    }
}
