import java.util.Arrays;
public class Maxa {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,56,78,98,8};
    System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxval=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxval){
             maxval=arr[i];
            }
        }
        return maxval;
    }
}
