import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter day number(1-7):");
        int day = obj.nextInt();

        switch (day){
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
