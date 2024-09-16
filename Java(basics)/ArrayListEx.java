import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list=new ArrayList<Integer>(5);
        Scanner in = new Scanner(System.in);
        // list.add(10);
        // list.add(11);
        // list.add(12);
        // list.add(13);
        // list.add(14);
        // list.add(15);
        // list.add(16);
        // list.add(17);
        // list.add(18);
        // System.out.println(list.contains(12));
        // list.set(0,99);
        // list.remove(3);
        // System.out.println(list);
        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
      System.out.println(list);
      //to get item on any index
      for (int i = 0; i < 5; i++) {
         System.out.println(list.get(i));
      }
    }
}
