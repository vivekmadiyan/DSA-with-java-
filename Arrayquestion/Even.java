//WAP to get even number from an arr


import java.util.*;

public class Even {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        
        // Count numbers with even number of digits
        System.out.println("Count of numbers with an even number of digits: " + findNumbers(nums));
        
        // Print even numbers in the array
        System.out.println("Even numbers in the array: ");
        printEvenNumbers(nums);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int num) {
        int numberOfDigits = countDigits(num);
        return numberOfDigits % 2 == 0;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}






    // public static void main(String[] args) {
    //     int[] arr = {1,3,2,4,6,5};
    //     System.out.println(even(arr));
                     
    // }


    // static int even(int[] arr){
    //     for(int i = 0 ; i < arr.length ; i++){
    //         if(arr[i]%2 == 0){
    //             // System.out.println("The even digits are:");
    //                 // return arr[i];
    //                 System.out.println(arr[i]);
    //                 // break ;
    //         }
    //         // return -1;
    //         // return +1 ;
    //     }
    //     return -1;
    // }
