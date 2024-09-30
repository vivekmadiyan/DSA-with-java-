public class Findinfinite {
    public static void main(String[] args) {
        int[] arr = {12, 25, 86, 98, 99, 101};
      
        int target = 86;
        
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
      int first=0;
      int last=1;
      while(target>arr[end]){
        int newFirst=last+1;
        //end=previous end+ sizeofbox*2
        last=last+(last-first+1)*2;
        first=newFirst;
      }
      return binarysearch(arr, first, last, target);
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
