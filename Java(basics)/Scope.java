public class Scope {
    public static void main(String[] args) {
        //anything intialized outside the block can be used inside the block , anything intialized inside the block can not be use outside.
        int a=10;
        int b=20;
        // int a=90;
        {
             a=78;
             System.out.println(a);
            int c=90;
            //values intialized in this block ,will reamin in block.
        }
        int c=900;
        System.out.println(c);
        // System.out.println(c); cannot use outside the block
    }
    static void random(int marks){
         int num=67;
         System.out.println(num);
         System.out.println(marks);
    }
}
