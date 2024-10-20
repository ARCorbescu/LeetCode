class Solution {
    public boolean canJump(int[] nums) {
        int max_reach = 0;
        int n = nums.length;

        // Early exit if there's only one element
        if (n == 1) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            // If the current index is beyond max_reach, we can't proceed
            if (i > max_reach) {
                return false;
            }

            // Update max_reach
            max_reach = Math.max(max_reach, i + nums[i]);

            // If max_reach is already at or beyond the last index, return true
            if (max_reach >= n - 1) {
                return true;
            }
        }

        return false;
    }
}