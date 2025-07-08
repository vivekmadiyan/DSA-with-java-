public class Main{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int result=1;
        int[] prod= new int[a.length];
        for(int i=0;i<a.length;i++){
            result=result*a[i];
        }
        for(int j=0;j<a.length;j++){
            prod[j] =result/a[j];
        }
       
        for (int value : prod) {
            System.out.println(value);
        }
    }
}

