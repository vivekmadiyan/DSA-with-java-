public class SearchinMountain {
    public static void main(String[] args) {
        // Example usage
        SearchinMountain searchinMountain = new SearchinMountain();
        int[] arr = {1, 3, 8, 12, 4, 2};
        int target = 4;
        int result = searchinMountain.search(arr, target);
        System.out.println("Index of target is: " + result);
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, 0, peak, target);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBinarySearch(arr, peak + 1, arr.length - 1, target);
        }
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
