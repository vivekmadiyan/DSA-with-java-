import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
      int[][] nums={
        {1,2,3},
        {5,6,7},
        {23,4,98},
        {14,56,55,45}
      };
      int target=556;
      int[] ans=search(nums,target);
      System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
            
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
            
        }
        return null;
    }
}
