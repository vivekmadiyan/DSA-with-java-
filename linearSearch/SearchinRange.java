public class SearchinRange {
    public static void main(String[] args) {
        int[] nums={89,90,76,45,79,89};
        int start=1;
        int end=4;
        int target=45;
        System.out.println(search(nums,target,start, end));
    }
    static boolean search(int arr[],int target,int start,int end){
     if(arr.length==0){
        return false;
     }
     for (int i = start; i <= end; i++) {
        int element=arr[i];
        if(element==target){
            return true;
        }
     }
     return false;
    }
}
