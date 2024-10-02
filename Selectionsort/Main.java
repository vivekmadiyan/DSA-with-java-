import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={5,4,3,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex = max(arr,0,last);
            swap(arr,  maxIndex,last);
        }
    }
    static int max(int arr[],int start,int end){
        //   if(arr.length==0){
        //     return -1;
        //   }
        int maxIndex=start;
          for (int i = start; i <= end; i++) {
          
               
                if(arr[i]>arr[maxIndex]){
                    maxIndex=i;
                }
            }
          
          
          return maxIndex ;
        }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}