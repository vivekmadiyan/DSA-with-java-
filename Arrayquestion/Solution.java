public class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return new int[0];
        }

        int arr[] = new int[nums.length - k + 1];
        int i = 0;
        int j = k - 1;
        int a = 0;
        while (j < nums.length) {
            if (solved(nums, i, j)) {
                arr[a] = nums[j];
            } else {
                arr[a] = -1;
            }
            i++;
            j++;
            a++;
        }
        return arr;
    }

    private boolean solved(int nums[], int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input array and value of k
        int[] nums = {1, 2, 3, 4, 2, 3, 4, 5};
        int k = 3;

        // Call the resultsArray method
        int[] result = solution.resultsArray(nums, k);

        // Print the result array
        System.out.print("Result: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
