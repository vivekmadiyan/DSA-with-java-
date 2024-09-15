public class Overloading {
  //when two or more function with same name but diffrent parameters.
    public static void main(String[] args) {
    int ans = sum(5,6);
    int ans2= sum(6,5,5);
    System.out.println(ans);
    System.out.println(ans2);
    
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}