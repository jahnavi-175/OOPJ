import java.util.Scanner;

class S2D {
    float length, breadth;
    float area(float l , float b){
        length=l;
        breadth=b;
        float a=length*breadth;
        float cost = a*40;
        return cost;
    }
}
class B3D extends S2D {
    float height;
    float vol(float l , float b , float h){
        this.length=l;
        this.breadth=b;
        height=h;
        float v=length*breadth*height;
        float cost = v*60;
        return cost;
    }
}
public class Sinherit {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length, breadth of sheet:");
        float l= obj.nextFloat();
        float b= obj.nextFloat();
        S2D s=new S2D();
        System.out.println("Cost of plastic per square ft.: Rs"+s.area(l,b));

        System.out.print("Enter height of box:");
        float h=obj.nextFloat();
        B3D ob=new B3D();
        System.out.println("Cost of plastic per cubic ft.: Rs"+ob.vol(l,b,h));

        obj.close();
    }
}
