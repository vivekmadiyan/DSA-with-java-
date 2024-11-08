public class MaxXor {
    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 1, 1, 3};
        int maximumBit = 2;

        // Create an instance of Solution and call the method
        Solution sol = new Solution();
        int[] result = sol.getMaximumXor(nums, maximumBit);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] result = new int[n];
        int xor = 0;
        int maxVal = (1 << maximumBit) - 1; // 2^maximumBit - 1

        // Calculate the cumulative XOR of the nums array
        for (int num : nums) {
            xor ^= num;
        }

        // Iterate from the end of the nums array to the beginning
        for (int i = 0; i < n; i++) {
            // Calculate the maximum k value
            result[i] = xor ^ maxVal;

            // Update xor by removing the last element considered
            xor ^= nums[n - 1 - i];
        }

        return result;
    }
}
