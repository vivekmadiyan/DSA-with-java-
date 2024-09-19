public class Transposematrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
       int rows=matrix.length;
       int cols=matrix[0].length;
       int[][] transpose=new int [cols][rows];
       for(int i=0;i<rows;i++){
        for (int j = 0; j < cols; j++) {
            transpose[j][i]=matrix[i][j];
        }
       }
       for(int i=0;i<rows;i++){
        for (int j = 0; j < cols; j++) {
            System.out.println(" " + transpose[i][j]);
        }
        System.out.println("\n");
       }
      
    }
    
}