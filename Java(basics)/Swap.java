public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap( a, b);
      
        //swap
        // int temp=a;
        // a=b;
        // b=temp;

        
    }
    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1 +" " + num2);
        //this will be valid in this function scope;
    }
}
