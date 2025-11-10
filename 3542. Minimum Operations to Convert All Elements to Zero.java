//using monotonic stack
//TC=O(n) SC=O(n)

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minOperations(int[] nums) {
         int ans=0;
         Deque<Integer> st = new ArrayDeque<>();
         st.push(0);

         for (int num : nums) {
            while (!st.isEmpty() && st.peek() > num) {
                st.pop();
            }
            if (st.peek() < num) {
                ans++;
                st.push(num);
            }
        }
        return ans;
    }
}
