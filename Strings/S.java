public class S {
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        String result = s.replaceAll("[ , :]", "");
        System.out.println(result);
    }
}
