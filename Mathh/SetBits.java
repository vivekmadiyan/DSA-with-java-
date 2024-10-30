public class SetBits {
    public static void main(String[] args) {
        int n=1054;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));
        ////FIRST
    //    int n=9;
    //    int count=0;
    //     while(n>0){
    //         if((n&1)==1){
    //           count++;
    //         }
    //         n=n>>1;
    //     }
    //     System.out.println(count);
    }
    private static int SetBits(int n){
        int count=0;
        ////SECOND
        // while(n>0){
        //     count++;
        //     n-=(n & -n);
        // }
        ////THIRD
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
