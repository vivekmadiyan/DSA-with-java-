import java.util.Arrays;

public class maxin {
    public static void main(String[] args) {
      int[][] nums={
        {1,2,3},
        {5,6,7},
        {23,4,98},
        {14,56,55,45}
      };
     
      int ans=search(nums);
      System.out.println(ans);
    }
    static int search(int[][] arr){
        int max=arr[0][0];

      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
            
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            
        }
        return max;
    }
}

