public class Firstandlastposition {
    public static void main(String[] args) {
        int[] arr = {12, 25, 86, 98, 99, 101};
        int first = 0;
        int last = arr.length-1;
        int target = 86;
        int ans = binarysearch(arr, first, last, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int first, int last, int target) {
     
        int[] ans={-1,-1};
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
        return ans;
    }
 //this function justr returns the index value of target
 int search(int[] nums, boolean findStartIndex){
    int ans=-1;
    while (first <= last) {
        int mid = first + (last - first) / 2;
        if (arr[mid] == target) {
            ans=mid;
            if(findStartIndex==true){

            }
        } else if (arr[mid] < target) {
            first = mid + 1;
        } else {
            last = mid - 1;
        }
 }
}
}
