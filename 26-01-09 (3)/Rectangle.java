import java.util.Scanner;
class Rectangle {
    float length, breadth, peri, area;
    void read(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        length = obj.nextFloat();
        breadth = obj.nextFloat();
    }
    void calculate(){
        peri = 2*(length+breadth);
        area = (length*breadth);
    }
    void display(){
        System.out.println("Perimeter of Rectangle: "+peri + "\nArea of Rectangle: "+area);
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.read();
        rec.calculate();
        rec.display();
    }
}
