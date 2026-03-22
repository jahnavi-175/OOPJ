import java.util.Scanner;
public class ArrayEx {
    public static void main(String[] args){
        int arr[] = new int[4];
        Scanner obj = new Scanner(System.in);
        try{
            for(int i=0; i<5; i++){
                System.out.print("Enter the numbers: ");
                arr[i] = obj.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception in thread 'main'");
            e.printStackTrace();
        }
        obj.close();
    }
}
