import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a no.:");
        int num=obj.nextInt();

        int og=num;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev = rev*10+digit;
            num/=10;
        }
        if(og==rev){
            System.out.println(og+ " is palindrome.");
        }
        else{
            System.out.println(og+ " is not palindrome.");
        }
    }
}
