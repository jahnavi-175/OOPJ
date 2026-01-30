import java.util.Scanner;
class Box {
    float length, breadth, height;
    void volume(){
        float vol= length*breadth*height;
        System.out.println("Volume: "+vol);
    }
}

class Demo {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Box b = new Box();
        System.out.print("Enter length: ");
        b.length = obj.nextFloat();
        System.out.print("Enter breadth: ");
        b.breadth = obj.nextFloat();
        System.out.print("Enter height: ");
        b.height = obj.nextFloat();
        b.volume();
    }
}