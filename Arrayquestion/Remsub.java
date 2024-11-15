public class ShortestSubarrayRemoval {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;

        // Step 1: Find longest non-decreasing prefix
        int left = 0;
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        // If the whole array is already sorted
        if (left == n - 1) {
            return 0;
        }

        // Step 2: Find longest non-decreasing suffix
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        // Calculate the minimal length to remove
        int minLength = Math.min(n - left - 1, right);

        // Step 3: Check the middle part to find the minimal length to remove
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                minLength = Math.min(minLength, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 4, 2, 3, 5};
        System.out.println(findLengthOfShortestSubarray(arr));  // Output: 3
    }
}

