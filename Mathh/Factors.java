public class Factors {
    public static void main(String[] args) {
          
      
          int  n=20;
          fact(n);
        }
        
    
    static void fact(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                 System.out.println(i);
            }
        }

    }
}
