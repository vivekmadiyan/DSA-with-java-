public class PowOf2 {
    public static void main(String[] args) {
        int n=19;
        boolean isPow2=  n>0 && ((n-1)&n)==0;
        System.out.println(isPow2);
    }
}
