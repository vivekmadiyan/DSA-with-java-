import java.util.Scanner;
import java.util.Arrays;

public class colnotfixed {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr =new int[3][2];
        System.out.println(arr.length);
        //input
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        //Output
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
                // System.out.println(arr[row][col]);
        //     }
        // }
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));

        }
    }
}
