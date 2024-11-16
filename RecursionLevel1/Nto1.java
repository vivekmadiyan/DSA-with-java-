

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        funREv(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funREv(int n){
        if(n==0){
            return;
        }
        
        funREv(n-1);
        System.out.println(n);
    }
}
