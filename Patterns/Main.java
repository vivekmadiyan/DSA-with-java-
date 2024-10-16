

public class Main {
    public static void main(String[] args) {
        // pattern2(4);
        // pattern1(5);
        // pattern3(5);
        //pattern4(5);
        pattern7(5);
    }
    static void pattern2(int n){
        for(int rows=1;rows<=n;rows++){
            //for every row run col
            for(int cols=1;cols<=rows;cols++){
            System.out.print("* ");
            }
            //when one row is printed we need to add a newline
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int rows=1;rows<=n;rows++){
            //for every row run col
            for(int cols=1;cols<=n;cols++){
            System.out.print("* ");
            }
            //when one row is printed we need to add a newline
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int rows=1;rows<=n;rows++){
            //for every row run col
            for(int cols=1;cols<=n-rows+1;cols++){
            System.out.print("*");
            }
            //when one row is printed we need to add a newline
        
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int rows=1;rows<=n;rows++){
            //for every row run col
            for(int cols=1;cols<=rows;cols++){
            System.out.print(rows);
            }
            //when one row is printed we need to add a newline
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int rows=1;rows<=n;rows++){
            //for every row run col
            for(int cols=1;cols<=rows;cols++){
            System.out.print(cols);
            }
            //when one row is printed we need to add a newline
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int rows=0;rows<=2*n;rows++){
            //for every row run col
            int totalcols=rows>n? 2*n -rows:rows;
            for(int cols=0;cols<totalcols;cols++){
            System.out.print("*");
            }
            //when one row is printed we need to add a newline
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int rows=0;rows<=2*n;rows++){
            //for every row run col
            int totalcols=rows>n? 2*n -rows:rows;
            int noofSpaces=n-totalcols;
            for(int s=0;s<noofSpaces;s++){
                System.out.print(" ");
            }
            for(int cols=0;cols<totalcols;cols++){
            System.out.print("* ");
            }
            //when one row is printed we need to add a newline
            System.out.println();
        }
    } +++++++++++++++++++++++++++++++++++++++++++++++++++++
}

