// to take input from user and print it.
//import scanner class.

import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        // System.out.println("Enter your roll no :");
        // Scanner input=new Scanner(System.in);
        // System.out.println("Your roll no is"+ input.nextInt());

        // System.out.println("Enter Your Name");
        // Scanner input=new Scanner(System.in);
        // System.out.println("Your name is :"+ input.nextLine());
        
        System.out.println("Enter your marks:");
        Scanner input=new Scanner(System.in);
        System.out.println("Your marks is"+ input.nextFloat());

        input.close();
    }
}