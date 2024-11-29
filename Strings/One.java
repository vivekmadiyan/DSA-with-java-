// import java.util.Arrays;

// public class Revstrarr {
//     public static void main(String[] args) {
//         char[] s = {'h', 'e', 'l', 'l', 'o'};
//         revstr(s);

//     }
//     static void revstr(char[] arr){
//         int left=0;
//         int right=arr.length-1;
//         while (left<right) {
//             char temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//             left++;
//             right--;
//         }
       
//         System.out.println(Arrays.toString(arr));

//     }
// }
public class One{
    public static void main(String[] args){
       int n=10;
       oneton(n);
       
    }
    static void oneton(int n){
        if(n<=0){
            return;
        }
        else{

            oneton(n-1);
            System.out.println(n);
        }
    }
}

