import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = obj.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.print("Enter elements of array:");
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();

        System.out.print("Initial array:");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println(" ");

        for(int pass = 0; pass < n - 1; pass++) {
            for(i = 0; i < n - 1 - pass; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
             }
        }
        System.out.print("Final array:");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
