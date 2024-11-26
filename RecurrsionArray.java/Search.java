import java.util.ArrayList;
public class Search {
    public static void main(String[] args) {
        int[] arr={1,2,3,18,18,9};
        int target=18;
        int index=0;
        // System.out.println(search(arr, target, index));
        // System.out.println(searchIndex(arr, target, index));
        ArrayList ans=searchIndexAll(arr, target, index, new ArrayList<>());
        System.out.println(ans);
        
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
    //  static ArrayList<Integer> list=new ArrayList<>();
    //  static void searchIndexAll(int [] arr,int target,int index){
    //     if(index==arr.length){
    //       return ;
    //     }
    //     if(arr[index]==target){
    //     list.add(index);
    //     System.out.println(list);
    //     }
    
    //        searchIndexAll(arr, target, index + 1);
        
    //  }

     static ArrayList<Integer> searchIndexAll(int [] arr,int target,int index, ArrayList<Integer> list){
        if(index==arr.length){
          return list;
        }
        if(arr[index]==target){
        list.add(index);
        
        }
    
           return searchIndexAll(arr, target, index + 1, list);
           
        
     }
     
}
