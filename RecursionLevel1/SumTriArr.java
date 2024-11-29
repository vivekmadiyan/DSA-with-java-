import java.util.Arrays;

public class SumTriArr {

    public static void main(String[] args) {
        int [] A={1,2,3,4,5};//create an array
        printtriangle(A);

    }
    static void printtriangle(int[] A){
        if(A.length<1){
            return;
        }
       int [] B= new int[A.length-1];
       for(int i=0;i<A.length-1;i++){
        int x=A[i]+A[i+1];
        B[i]=x;
       }
       printtriangle(B);
       System.out.println(Arrays.toString(A));
    }
}