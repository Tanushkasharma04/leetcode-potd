//TC: O(N) as two both dfs traversals are done only once through the tree
//SC: O(H) H is height of tree
class Solution {
    
        long sum=0;
        long maxP=0;

        //take out totalSum
        public long totalSum(TreeNode root){
            if(root == null) return 0;
            long left=totalSum(root.left);
            long right=totalSum(root.right);
            
            return root.val+left+right;
        }
        //make dfs
        public long dfs(TreeNode root){
            if(root==null) return 0;
            long left = dfs(root.left);
        long right = dfs(root.right);

        long subtreeSum = root.val + left + right;
        long remaining = sum - subtreeSum;

        maxP = Math.max(maxP, subtreeSum * remaining);

        return subtreeSum;

        }
         public int maxProduct(TreeNode root) {
            sum=totalSum(root);
            dfs(root);
            return (int)(maxP % 1000000007);
    }
}