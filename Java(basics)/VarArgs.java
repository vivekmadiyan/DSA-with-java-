import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        demo(2,3,4,5,6);
        demo("vivek","parag");
        
    }
    static void demo(String ...v){
      System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
      System.out.println(Arrays.toString(v));
    }
}
