public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr = {101,25,23,11,10,2};
        int first = 0;
        int last = arr.length-1;
        int target =11;
        if(arr[first]>arr[last]){
        int ans = orderagnosticBS(arr, first, last, target);
        System.out.println(ans);
        }
        else{
        int ans = binarysearch(arr, first, last, target);
        System.out.println(ans);
        }
    }
    static int orderagnosticBS(int[] arr, int first, int last, int target) {
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
               last=mid-1;
            } else {
               first=mid+1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int first, int last, int target) {
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
        return -1;
    }
}


