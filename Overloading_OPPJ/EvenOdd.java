import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int even=0, odd=0;
        Scanner obj = new Scanner(System.in);
        int arr[]= new int[10];
        System.out.print("Enter exactly 10 numbers:");
        for(int i=0 ; i<10 ; i++){
            arr[i] = obj.nextInt();
            if(arr[i]%2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);
    }
     
}
