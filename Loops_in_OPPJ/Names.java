import java.util.Scanner;
public class Names {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st name:");
        String w1 = obj.nextLine();
        System.out.print("Enter 2nd name:");
        String w2 = obj.nextLine();

        System.out.println(w2+" "+w1);
    }
}
