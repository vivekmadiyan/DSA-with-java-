public class BinarySearch {
    public static void main(String[] args) {
        int [] nums={10,12,15,17,19};
        int start=0;
        int end=nums.length-1;
        int target=19;
        int ans=search(nums, target, start, end);
        System.out.println(ans);

    }
    static int search(int[] arr, int target ,int start ,int end ){
        if (start > end) {
            return -1; 
        }

        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
        return search(arr,target,start,mid-1);
        }
        else{
         return search(arr, target,mid+1,end);
        }
    }
}
