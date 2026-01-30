import java.util.Scanner;

class Overload {
    void subtract(int a, int b){
        System.out.println("Result: "+(a-b));
    }
    void subtract(int a, int b, int c){
        System.out.println("Result: "+(a-b-c));
    }
    void subtract(float a, float b){
        System.out.println("Result: "+(a-b));
    }
}
class Driver{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Overload o = new Overload();

        System.out.println("Enter 2 integers: ");
        int x0 = obj.nextInt();
        int y0 = obj.nextInt();
        o.subtract(x0 , y0);

        System.out.println("Enter 3 integers: ");
        int x = obj.nextInt();
        int y = obj.nextInt();
        int z = obj.nextInt();
        o.subtract(x , y ,z);

        System.out.println("Enter 2 decimal numbers: ");
        float x1 = obj.nextFloat();
        float y1 = obj.nextFloat();
        o.subtract(x1 , y1);

    }
}
