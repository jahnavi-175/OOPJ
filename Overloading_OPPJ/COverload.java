import java.util.Scanner;

public class COverload {
    float length, breadth;
    COverload(){
        length = 0;
        breadth = 0;
    }
    COverload(float l, float b){
        length = l;
        breadth = b;
    }
    void area(){
        float area = length*breadth;
        System.out.println("Area = "+area);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        float l = obj.nextFloat();
        float b = obj.nextFloat();

        COverload co = new COverload(l , b);
        co.area();

    }
}
