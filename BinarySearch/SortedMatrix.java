public class SortedMatrix {
    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 10;
        int[] result = search(matrix, target);
        System.out.println("Element found at: [" + result[0] + ", " + result[1] + "]");
    }

    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] {row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) { // While this is true, it means we have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows remaining
        // Check 1st half
        if (matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        // Check 2nd half
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1, cMid};
        }

        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarysearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // Search in 4th half
        else {
            return binarysearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
