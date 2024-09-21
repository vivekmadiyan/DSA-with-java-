import java.util.Arrays;

public class minin {
    public static void main(String[] args) {
      int[][] nums={
        {25,25,76},
        {5,6,7},
        {23,-4,98},
        {14,56,55,45}
      };
     
      int ans=search(nums);
      System.out.println(ans);
    }
    static int search(int[][] arr){
        int min=arr[0][0];

      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
            
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            
        }
        return min;
    }
}


