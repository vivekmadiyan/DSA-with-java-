// public class Arrayques {
//     public static void main(String[] args) {
//         int[] nums=new int[10];
//         int target;
//         int n=nums.length;
//          static int[] twosum(){
//         for(i=0;i<n-1;i++){
//             for(j=i+1;j<n;j++){
//                 if(nums[i]+nums[i+1]==target){
//                     return int[]{i,j};
//                 }
//             }
//         }
//     }

//     }
// }
// public class Arrayques {
//     public static void main(String[] args) {
//         int[] nums = new int[10];
//         int target = 0; // Initialize target with some value
//         int[] result = twosum(nums, target);
//         if (result.length == 2) {
//             System.out.println("Indices: " + result[0] + ", " + result[1]);
//         } else {
//             System.out.println("No solution found.");
//         }
//     }

//     static int[] twosum(int[] nums, int target) {
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
