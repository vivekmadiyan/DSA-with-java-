public class Floor {
   public static void main(String[] args) {
            int[] arr = {12, 25, 86, 98, 99, 101};
            int first = 0;
            int last = arr.length-1;
            int target = 87;
            int ans = floorno(arr, first, last, target);
            System.out.println(ans);
        }
    
        static int floorno(int[] arr, int first, int last, int target) {
            while (first <= last) {
                int mid = first + (last - first) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
            return last;
        }
    }
    
    



