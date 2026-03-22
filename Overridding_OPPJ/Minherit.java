import java.util.Scanner;

class Plate {
    float length,breadth;
    Plate(float l, float b){
        length=l;
        breadth=b;
        System.out.println("Plate:\tLength:"+l+"\tBreadth:"+b);
    }
}

class Box extends Plate {
    float height;
    Box(float l, float b, float h){
        super(l,b);
        height=h;
        System.out.println("Box:\tLength:"+l+"\tBreadth:"+b+"\tHeight:"+h);
    }
}

class Woodbox extends Box {
    float thick;
    Woodbox(float l, float b, float h, float t){
        super(l,b,h);
        thick=t;
        System.out.println("Woodbox:Length:"+l+"\tBreadth:"+b+"\tHeight:"+h+"\tThickness:"+t);
    }
}
public class Minherit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length, breadth, height and thickness:");
        float l= obj.nextFloat();
        float b= obj.nextFloat();
        float h= obj.nextFloat();
        float t= obj.nextFloat();

        new Woodbox(l, b, h, t);

        obj.close();
    }
}
