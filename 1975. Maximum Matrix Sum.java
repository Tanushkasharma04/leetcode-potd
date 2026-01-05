//TC=O(ROW * COL) SC=O(1)
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        int count=0;
        long sum=0;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
            sum=sum+Math.abs(matrix[i][j]);
            if(matrix[i][j]<0){
             count++;
            }
            smallest=Math.min(smallest,Math.abs(matrix[i][j]));
            
        }
        }
        if(count%2==0){
            return (long)sum;
        }else{
            return (long)(sum - (2 * smallest));
        }
    }
}
