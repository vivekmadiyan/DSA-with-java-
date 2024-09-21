public class Ceiling {
    public static void main(String[] args) {
        int target=15;
        int [] arr={2,3,5,9,14,16,18};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target);
            }
            if(arr[i]!=target){
                target=arr[i+1];
                System.out.println(target);
            }
        }
    }
}
