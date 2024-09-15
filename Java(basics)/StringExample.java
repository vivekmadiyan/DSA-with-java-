public class StringExample {
    public static void main(String[] args) {
        // String message=greet();
        // System.out.println(message);

        String message=greet("hello");
        System.out.println(message);
    }
    // static String greet(){
    //     String greeting = "How are you";
    //     return greeting;
    // }
    static String greet( String msg){
        String greet="vivek is saying " + msg;
        return greet;
    }
}
