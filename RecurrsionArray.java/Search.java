public class Search {
    public static void main(String[] args) {
        int[] arr={1,2,3,18,9};
        int target=18;
        int index=0;
        System.out.println(search(arr, target, index));
        System.out.println(searchIndex(arr, target, index));
        
    }
    //to check if number exists or not
    static boolean search(int [] arr,int target,int index){
       if(index==arr.length){
         return false;
       }
       if(arr[index]==target){
        return true;
       }
       else{
          return search(arr, target, index+1);
       }
    }
    // to return index
    static int searchIndex(int [] arr,int target,int index){
        if(index==arr.length){
          return -1;
        }
        if(arr[index]==target){
         return index;
        }
        else{
           return searchIndex(arr, target, index+1);
        }
     }
}
