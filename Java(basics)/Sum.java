import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int num1=input.nextInt();
    int num2=input.nextInt();
    System.out.println("Sum of two no"+ (num1+num2));
    input.close();
    }
}
