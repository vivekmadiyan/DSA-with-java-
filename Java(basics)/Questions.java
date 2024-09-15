import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        //  Scanner in = new Scanner(System.in);
        // int n= in.nextInt();
        // System.out.println(isArmstrong(n));
        // System.out.println(isPrime(n));

    
    for(int i=100; i<1000; i++){
     if(isArmstrong(i)){
        System.out.println(i);
     }
    }
}
    
    static boolean isArmstrong(int n){
        int sum=0;
        int original=n;
        while (n>0){
            int rem = n%10;
            n=n/10;
            sum=rem*rem*rem+sum;
            
        }
        if(sum==original){
            return true;
        }
        else{
            return false;
        }
        
    }
    // static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     int c=2;
    //     while(c*c<=n){
    //     if(n%c==0){
    //         return false;
    //     }
    //     c++;
    //     }
    //     return true;
    // }
}
