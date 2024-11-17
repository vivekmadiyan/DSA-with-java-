public class RevNum {
    public static void main(String[] args) {
       int ans=rev(182);
       ans=ans*10;
       System.out.println(ans);

    }
    static int rev(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)+rev(n/10);
    }
}
