import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    char ch =input.next().trim().charAt(0);
    System.out.println(ch);
    if(ch>='a' && ch<= 'z'){
        System.out.println("lower case");
    }
    if(ch>='A' && ch<='Z' ){
        System.out.println("uppercase");
    }
    
    
    
    }
}
