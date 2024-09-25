public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        int first = 0;
        int last = arr.length-1;
        
        char target ='d';
        int ans = smallestletter(arr, first, last, target);
        System.out.println(ans);
    }

    static int smallestletter(char[] arr, int first, int last, int target) {
        while (first <= last) {
           
            int mid = first + (last - first) / 2;
            if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        
      if(arr[first]==target){
        int n=arr.length;
        return first%n;
      }
      else{
        return first;
      }
    }
}
