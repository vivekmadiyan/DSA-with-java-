public class Test {
    public static int minOperationsToPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        int operations = 0;

        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else if (arr[left] < arr[right]) {
                arr[left + 1] += arr[left];
                left++;
                operations++;
            } else {
                arr[right - 1] += arr[right];
                right--;
                operations++;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        System.out.println("Minimum operations: " + minOperationsToPalindrome(arr));

        // Final output logic
        System.out.print("Final Palindrome: ");
        int middle = arr.length / 2; // Find middle of merged palindrome
        for (int i = 0; i <= middle; i++) {
            System.out.print(arr[i] + " "); // Output the first half (mirrored structure)
        }
    }
}