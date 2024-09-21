public class Main {
    public static void main(String[] args) {
        int[] nums={23,45,1,56,78,0,8};
        int target=78;
        int ans=linearSearch(nums, target);
        System.out.println("target element is at the index "+ ans);
    }
    //Search in the array : retuen index if item found otherwise -1;
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
         return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is target;
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        //if not exists then print -1;
        return -1;
    }
}
