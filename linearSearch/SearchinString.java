public class SearchinString {
    public static void main(String[] args) {
        String name="vivek";
        char target='i';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char character=str.charAt(i);
            if(character==target){
                return true;
            }
        }
        return false;
    }
}
