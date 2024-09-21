

public class findMin {
    public static void main(String[] args) {
        int[] nums={12,25,24,65,98,75,89,11,10,-1};
        int ans=min(nums);
        System.out.println(ans);

    }
    static int min(int arr[]){
    //   if(arr.length==0){
    //     return -1;
    //   }
    int minvalue=arr[0];
      for (int i = 0; i < arr.length; i++) {
      
           
            if(arr[i]<minvalue){
                minvalue=arr[i];
            }
        }
      
      
      return minvalue ;
    }
}
