class Apple {
    void show(){
        System.out.println("This is Apple class. Apples are red and green.");
    }
}
class Banana extends Apple {
    void show(){
        System.out.println("This is Banana class. Bananas are yellow.");
    }
}
class Cherry extends Apple {
    void show(){
        System.out.println("This is Cherry class. Cherries are red.");
    }
}
public class MOverriding {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.show();
        Apple b = new Banana();
        b.show();
        Apple c = new Cherry();
        c.show();
    }
}
