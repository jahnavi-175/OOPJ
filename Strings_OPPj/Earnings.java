import java.util.Scanner;
import Marketing.Sales;
public class Earnings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id, name and basic salary: ");
        int id = sc.nextInt();
        String name = sc.next();
        double b = sc.nextDouble();

        Sales s = new Sales(id, name, b);
        double te = s.earnings();

        System.out.println("The emp id of employee is " +id);
        System.out.println("The total earning of employee is " +te);

        sc.close();
    }
}
