import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empid =in.nextInt();
        String department =in.next();
        switch (empid) {
            case 1:
                System.out.println("vivek madiyan");
                break;
            case 2:
               System.out.println("parag garg");
               break;
            case 3:
             switch (department) {
                case "it":
                    System.out.println("it department");
                    break;
                case "MANAGEMENT":
                    System.out.println("MANAGEMENT DEPARTMENT");
                    break;
                default:
                    break;
             }
            default:
                break;
        }
    }
}
