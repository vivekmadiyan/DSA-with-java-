public class Twosum{
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,4,6};
        int target=10;
        int[] result= twosum( arr ,target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution");
        }
       
    }
    static int[] twosum(int[] arr , int target){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
           for(int j=i+1;j<n;j++) {
            if(target==arr[i]+ arr[j]){
              return new int[]{i,j};
            }
           }
        }
        return null;
    }
}
// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                if(i!=j && arr[i]==2*arr[j]){
//                 return true;
//                }
              
//             }
//         }
//         return false;
//     }
// }