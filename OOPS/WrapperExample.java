
public class WrapperExample {
    public static void main(String[] args) {
        // int a =10;
        // int b=20;
        // Integer num=45;
        Integer a=10;
        Integer b=20;
        swap(a,b);
        // System.out.println(a+ " "+b);

        A obj;
        for (int i = 0; i < 1000; i++) {
            obj=new A("any name");
            System.out.println("obj");
        }

        // final int s=0;
        // s=9;
    }
    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
  
    }
    class A{
        final int num=90; // final should always intialized while declARING 
        String name;
        public A(String name){
         this.name=name;
        }
        @Override
        protected void finalize() throws Throwable{
            System.out.println("Obj is destroyed");
        }
}
