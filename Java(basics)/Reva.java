import java.util.Arrays;
public class Reva {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        rev(arr,0,5);
        System.out.println(Arrays.toString(arr));


    }

    static void rev(int[] arr ,int start,int end){
            while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}